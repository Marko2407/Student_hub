package com.mvukosav.studenthub.data

import android.util.Log
import com.mvukosav.studenthub.data.foodData.DemoQueries
import com.mvukosav.studenthub.data.foodData.calculateTotalFoodNutritionOfSelectedMealInDay
import com.mvukosav.studenthub.data.foodData.calculateTotalFoodNutritionOfSelectedMealPerDayType
import com.mvukosav.studenthub.domain.models.CategoryDay
import com.mvukosav.studenthub.domain.models.DailyMenu
import com.mvukosav.studenthub.domain.models.DailySelectedMeal
import com.mvukosav.studenthub.domain.models.Day
import com.mvukosav.studenthub.domain.models.Meal
import com.mvukosav.studenthub.domain.models.Nutrition
import com.mvukosav.studenthub.domain.models.SelectedMeal
import com.mvukosav.studenthub.domain.models.Week
import com.mvukosav.studenthub.domain.models.WeeklyMenu
import com.mvukosav.studenthub.domain.models.WeeklySelectedMeals
import com.mvukosav.studenthub.domain.repositories.FoodRepository
import com.mvukosav.studenthub.network.Response
import javax.inject.Inject

class LocalFoodRepository @Inject constructor() : FoodRepository {

    private var weeklyMenu: List<WeeklyMenu> = listOf()
    private var dailyMenu: List<DailyMenu> = listOf()
    private var weekDays: List<Week> = listOf()

    //get from SP
    private val selectedMeals: MutableList<SelectedMeal> = mutableListOf()
    private val selectedDailyMenu: MutableList<DailySelectedMeal> = mutableListOf()
    private val selectedWeeklyMenu: MutableList<WeeklySelectedMeals> = mutableListOf()
    private val weeklySelectedDailyMenu: MutableList<DailySelectedMeal> = mutableListOf()

    private var selectedDay: Day = Day.MONDAY
    private var selectedCategoryDay: CategoryDay = CategoryDay.BREAKFAST
    private var selectedDate: String = ""

    override suspend fun getWeeklyMenu(): Response<List<WeeklyMenu>> = fetchWeeklyMenu()

    override suspend fun getMenuByDay(day: Day): List<DailyMenu> {
        val food = dailyMenu
        return food
    }

    override fun getSelectedDate(): String = selectedDate

    override fun getSelectedMeals(date: String): List<DailySelectedMeal> {
        selectedDate = date
        selectedDailyMenu.clear()
        val currentDay = selectedMeals.filter { it.date == date }
        val grouped = currentDay.groupBy { it.dayType }
        grouped.entries.forEach {
            selectedDailyMenu.add(
                DailySelectedMeal(
                    date, selectedDay, it.key, it.value.toMutableList(),
                    listOf()
                )
            )
        }
        return selectedDailyMenu.sortedBy { it.dayType.ordinal }
    }

    override fun updateMealAmount(mealId: Int, amount: Int): List<DailySelectedMeal> {
        var dailySelected = selectedDailyMenu.sortedBy { it.dayType.ordinal }
        val selectedByDate = dailySelected.filter { it.date == selectedDate }
        var meal: SelectedMeal? = null
        selectedByDate.forEach {
            it.selectedMeals.forEach {
                if (it.meal.mealId == mealId) {
                    meal = it
                }
            }
        }
        if (meal != null) {
            meal!!.mealAmount += amount
            if (meal!!.mealAmount == 0) {
                selectedMeals.removeIf { it.meal.mealId == mealId }
                getMealById(mealId)?.isMealSelected = false
                dailySelected = getSelectedMeals(selectedDate).toMutableList()
            }
        }
        Log.d("MEAL", meal.toString())
        Log.d("MEAL_D", dailySelected.toString())
        return dailySelected
    }

    override fun getTotalNutrition(): List<Nutrition> =
        calculateTotalFoodNutritionOfSelectedMealInDay(selectedDailyMenu)

    override fun getWeeklySelectedFood(): List<WeeklySelectedMeals> {
        val f = getWeeklySelectedMeals()
        selectedWeeklyMenu.clear()
        val keys = f.groupBy { it.day }
        val entries = keys.entries.toList()
        keys.keys.forEachIndexed { index, day ->
            selectedWeeklyMenu.add(
                WeeklySelectedMeals(
                    day,
                    entries[index].value[0].date,
                    listOf(entries[0].value[0]),
                    calculateTotalFoodNutritionOfSelectedMealInDay(entries[index].value.toMutableList())
                )
            )
        }

        return selectedWeeklyMenu.sortedBy { it.day.ordinal }
    }

    private fun getWeeklySelectedMeals(): List<DailySelectedMeal> {
        weeklySelectedDailyMenu.clear()
        val groupedByDate = selectedMeals.groupBy { it.date }
        groupedByDate.forEach { groupedData ->
            val currentDay = selectedMeals.filter { it.date == groupedData.key }
            val grouped = currentDay.groupBy { it.dayType }
            grouped.entries.forEach {
                weeklySelectedDailyMenu.add(
                    DailySelectedMeal(
                        groupedData.key, currentDay[0].mealDay, it.key, it.value.toMutableList(),
                        listOf()
                    )
                )
            }
        }

        return weeklySelectedDailyMenu.sortedBy { it.day.ordinal }
    }

    private fun findMealByIdTroughAll(mealId: Int): Meal? {
        weeklyMenu.forEach { daily ->
            daily.dailyMenu.forEach { dailyMenu ->
                dailyMenu.food.forEach { food ->
                    food.MealList.forEach { meal ->
                        if (meal.mealId == mealId) return meal
                    }
                }
            }
        }
        return null
    }

    override suspend fun getFoodByDayCategory(): DailyMenu? {
        dailyMenu = getDailyMenu(selectedDay)
        val dailyMenu = weeklyMenu.find { it.isDaySelected }

        return dailyMenu?.dailyMenu?.find { it.dayPartCategory == selectedCategoryDay }
    }

    override fun onTypeOfDaySelected(categoryDay: CategoryDay) {
        dailyMenu.find { it.dayPartCategory == selectedCategoryDay }?.isSelected = false

        dailyMenu.find { it.dayPartCategory == categoryDay }?.isSelected = true

        selectedCategoryDay = categoryDay
    }

    override fun onDaySelected(day: Day) {
        weeklyMenu.find {
            it.day == selectedDay
        }?.isDaySelected = false

        weeklyMenu.find {
            it.day == day
        }?.isDaySelected = true

        weeklyMenu.find { it.isDaySelected }?.let {
            selectedDate = it.date
        }

        selectedDay = day
    }


    override fun getMealById(mealId: Int): Meal? = findMealByIdTroughAll(mealId)


    override fun onMealSelected(mealId: Int): Int {
        // find meal and put as selected
        val meal = getMealById(mealId)
        if (meal != null) {
            meal.isMealSelected = !meal.isMealSelected
            if (selectedMeals.find { it.meal.mealId == meal.mealId } == null) {
                selectedMeals.add(
                    SelectedMeal(
                        meal,
                        selectedDay,
                        selectedCategoryDay,
                        1,
                        selectedDate
                    )
                )
            } else {
                selectedMeals.removeIf { it.meal.mealId == mealId }
            }
        }
        return selectedMeals.filter { it.mealDay == selectedDay }.size
    }

    override fun getWeekDays(): List<Week> {
        val listOfDays = mutableListOf<Week>()
        weeklyMenu.forEach {
            listOfDays.add(Week(it.day, it.isDaySelected))
            if (it.isDaySelected) selectedDay = it.day
        }
        weekDays = listOfDays
        return weekDays
    }

    private fun fetchWeeklyMenu(): Response<List<WeeklyMenu>> {
        weeklyMenu = DemoQueries.getFoodData().foodData

        weeklyMenu.find {
            it.isDaySelected
        }?.let {
            selectedDay = it.day
            selectedDate = it.date
        }

        dailyMenu = getDailyMenuInitial(selectedDay)

        return Response.Result(weeklyMenu)
    }

    private fun getDailyMenuInitial(day: Day): List<DailyMenu> {
        val daily = weeklyMenu.find {
            it.day == day
        }?.dailyMenu

        daily?.find { it.isSelected }?.let { selectedCategoryDay = it.dayPartCategory }

        selectedMeals.forEach {
            getMealById(it.meal.mealId)?.isMealSelected = true
        }

        return daily ?: listOf()
    }

    private fun getDailyMenu(day: Day): List<DailyMenu> {
        val daily = weeklyMenu.find {
            it.day == day
        }?.dailyMenu

        selectedMeals.forEach {
            getMealById(it.meal.mealId)?.isMealSelected = true
        }

        return daily ?: listOf()
    }
}