package com.mvukosav.studenthub.domain.models

import com.mvukosav.studenthub.R

data class DailyMenu(
    val dayPartCategory: CategoryDay = CategoryDay.BREAKFAST,
    val food: List<Food> = listOf(),
    var isSelected: Boolean = false
)

enum class CategoryDay(val title: String) {
    BREAKFAST("Breakfast"),
    LUNCH("Lunch"),
    DINNER("Dinner"),
}

enum class FoodCategory(val title: String) {
    OTHERS("Others"),
    MENUS("Menu's"),
    DRINKS("Drinks"),
    DESERTS("Desert"),
    ADDITIONAL_MEALS("Additional meals"),
}

data class Food(
    val foodCategory: FoodCategory = FoodCategory.OTHERS,
    val MealList: List<Meal>
)

data class Meal(
    val mealId: Int = 0,
    val mealName: String = "",
    val mealDescription: String? = null,
    val mealNutrition: List<Nutrition> = listOf(),
    val mealAllergens: List<Allergens> = listOf(),
    val mealImage: Int = R.drawable.generic_food_img,
    val mealWeight: Int = 0,
    var isMealSelected: Boolean = false
)

data class Nutrition(
    val name: String,
    val value: Int
)

data class Allergens(val name: String)

data class WeeklyMenu(
    val day: Day = Day.MONDAY,
    val date: String = "",
    val dailyMenu: List<DailyMenu> = listOf(),
    var isDaySelected: Boolean = false
)

data class Week(
    val day: Day = Day.MONDAY,
    var isDaySelected: Boolean = false
)

data class SelectedMeal(
    val meal: Meal,
    val mealDay: Day,
    val dayType: CategoryDay,
    var mealAmount: Int = 1,
    val date: String,
)

data class DailySelectedMeal(
    val date: String,
    val day: Day,
    val dayType: CategoryDay,
    val selectedMeals: MutableList<SelectedMeal>,
    val totalCaloriesPerDayType: List<Nutrition>
)

data class WeeklySelectedMeals(
    val day: Day,
    val date: String,
    var dailySelectedMeals: List<DailySelectedMeal>,
    val totalCaloriesPerDayType: List<Nutrition>
)

enum class Day(val dayName: String) {
    MONDAY("MON"),
    TUESDAY("TUE"),
    WEDNESDAY("WED"),
    THURSDAY("THU"),
    FRIDAY("FRI"),
    SATURDAY("SAT"),
    SUNDAY("SUN");
}


data class TotalPerDayType(
    val dayType: CategoryDay,
    val totalCalories: Int
)

data class MonthlySelectedMeals(
    val dateRange: String,
    val weeklySelectedMeals: List<WeeklySelectedMeals>
)