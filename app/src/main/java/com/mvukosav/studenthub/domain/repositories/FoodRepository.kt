package com.mvukosav.studenthub.domain.repositories

import com.mvukosav.studenthub.domain.models.CategoryDay
import com.mvukosav.studenthub.domain.models.DailyMenu
import com.mvukosav.studenthub.domain.models.DailySelectedMeal
import com.mvukosav.studenthub.domain.models.Day
import com.mvukosav.studenthub.domain.models.Meal
import com.mvukosav.studenthub.domain.models.Nutrition
import com.mvukosav.studenthub.domain.models.Week
import com.mvukosav.studenthub.domain.models.WeeklyMenu
import com.mvukosav.studenthub.domain.models.WeeklySelectedMeals
import com.mvukosav.studenthub.network.Response

interface FoodRepository {

    suspend fun getWeeklyMenu(): Response<List<WeeklyMenu>>

    suspend fun getMenuByDay(day: Day): List<DailyMenu>

    suspend fun getFoodByDayCategory(): DailyMenu?

    fun onTypeOfDaySelected(categoryDay: CategoryDay)

    fun onDaySelected(day: Day)

    fun getMealById(mealId: Int): Meal?

    fun onMealSelected(mealId: Int): Int

    fun getWeekDays(): List<Week>

    fun getSelectedDate(): String

    fun getSelectedMeals(date: String): List<DailySelectedMeal>

    fun updateMealAmount(mealId: Int, amount: Int): List<DailySelectedMeal>

    fun getTotalNutrition(): List<Nutrition>

    fun getWeeklySelectedFood(): List<WeeklySelectedMeals>
}