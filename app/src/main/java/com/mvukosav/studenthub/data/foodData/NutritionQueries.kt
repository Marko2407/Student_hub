package com.mvukosav.studenthub.data.foodData

import com.mvukosav.studenthub.domain.models.CategoryDay
import com.mvukosav.studenthub.domain.models.DailySelectedMeal
import com.mvukosav.studenthub.domain.models.Nutrition
import com.mvukosav.studenthub.domain.models.SelectedMeal
import com.mvukosav.studenthub.domain.models.TotalPerDayType

fun calculateTotalFoodNutritionOfSelectedMealPerDayType(
    dayType: CategoryDay,
    list: List<SelectedMeal>
): List<TotalPerDayType> {
    val total = mutableListOf<TotalPerDayType>()
    var calories = 0
    list.forEach { selectedMeal ->
        selectedMeal.meal.mealNutrition.forEach { nutrition ->
            val nutritionValue = nutrition.value * selectedMeal.mealAmount
            if (nutrition.name == "Calories") calories += nutritionValue
        }
    }
    total.add(TotalPerDayType(dayType, calories))
    return total
}

fun calculateTotalFoodNutritionOfSelectedMealInDay(listOfSelectedMeal: MutableList<DailySelectedMeal>): List<Nutrition> {
    val mealsNutrition = mutableListOf<Nutrition>()
    listOfSelectedMeal.forEach { daily ->
        daily.selectedMeals.forEach { selectedMeal ->
            selectedMeal.meal.mealNutrition.forEach { nutrition ->
                val nutritionValues =
                    Nutrition(nutrition.name, nutrition.value * selectedMeal.mealAmount)
                mealsNutrition.add(nutritionValues)
            }
        }
    }

    val groupedNutrition = mealsNutrition.groupBy {
        it.name
    }
    val keys = groupedNutrition.keys.toList()
    val mealNutrition = mutableListOf<Nutrition>()
    keys.forEach { key ->
        var count = 0
        groupedNutrition[key]?.forEach {
            count += it.value
        }
        mealNutrition.add(Nutrition(key, count))
    }

    return mealNutrition.toList()
}
