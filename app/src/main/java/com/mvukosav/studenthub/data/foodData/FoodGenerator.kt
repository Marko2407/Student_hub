package com.mvukosav.studenthub.data.foodData

import com.mvukosav.studenthub.R
import com.mvukosav.studenthub.domain.models.Allergens
import com.mvukosav.studenthub.domain.models.Food
import com.mvukosav.studenthub.domain.models.FoodCategory
import com.mvukosav.studenthub.domain.models.Meal
import com.mvukosav.studenthub.domain.models.Nutrition
import kotlin.random.Random

fun getAdditionMeal1(): Food = additionMeals1()
fun getAdditionMeal2(): Food = additionMeals2()
fun getAdditionMeal3(): Food = additionMeals3()
fun getAdditionMeal4(): Food = additionMeals4()
fun getAdditionMeal5(): Food = additionMeals5()
fun getAdditionMeal6(): Food = additionMeals6()
fun getAdditionMeal7(): Food = additionMeals7()
fun getAdditionMeal8(): Food = additionMeals8()
fun getAdditionMeal9(): Food = additionMeals9()
fun getAdditionMeal10(): Food = additionMeals10()
fun getAdditionMeal11(): Food = additionMeals11()
fun getAdditionMeal12(): Food = additionMeals12()
fun getAdditionMeal13(): Food = additionMeals13()
fun getAdditionMeal14(): Food = additionMeals14()
fun getAdditionMeal15(): Food = additionMeals15()
fun getAdditionMeal16(): Food = additionMeals16()
fun getAdditionMeal17(): Food = additionMeals17()
fun getAdditionMeal18(): Food = additionMeals18()
fun getAdditionMeal19(): Food = additionMeals19()
fun getAdditionMeal20(): Food = additionMeals20()
fun getAdditionMeal21(): Food = additionMeals21()
fun getAdditionMeal22(): Food = additionMeals22()


fun getMenu1(): Food = menu1()
fun getMenu2(): Food = menu2()
fun getMenu3(): Food = menu3()
fun getMenu4(): Food = menu4()
fun getMenu6(): Food = menu6()
fun getMenu7(): Food = menu7()
fun getMenu5(): Food = menu5()
fun getMenu8(): Food = menu8()
fun getMenu9(): Food = menu9()
fun getMenu10(): Food = menu10()
fun getMenu11(): Food = menu11()
fun getMenu12(): Food = menu12()
fun getMenu13(): Food = menu13()
fun getMenu14(): Food = menu14()
fun getMenu15(): Food = menu15()
fun getMenu16(): Food = menu16()
fun getMenu17(): Food = menu17()
fun getMenu18(): Food = menu18()
fun getMenu19(): Food = menu19()
fun getMenu20(): Food = menu20()
fun getMenu21(): Food = menu21()
fun getMenu22(): Food = menu22()

private fun getNutrition(valueP: Int = 56, valueC: Int = 435, valueS: Int = 5): List<Nutrition> {
    return listOf(
        Nutrition(
            name = "Calories", value = valueC
        ),
        Nutrition(

            name = "Protein", value = valueP
        ),
        Nutrition(
            name = "Salt", value = valueS
        ),
    )
}

private fun getAllergens(name: String = "Peanut"): List<Allergens> {
    return listOf(
        Allergens(
            name = name
        )
    )
}

private fun additionMeals1(idNumber: Int = 730): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Chicken breast marinade in olive oil ",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 241,
            mealImage = R.drawable.chicken_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Pommes frites",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 134,
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Eag",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(100),
            mealImage = R.drawable.eag
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Mash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals2(idNumber: Int = 735): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Roast pork",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_with_salad
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Smash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tuna",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals3(idNumber: Int = 740): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Fish and french fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Pork chop",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Veal fillet",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_meat_with_pasta
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tortellini",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals4(idNumber: Int = 745): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Roast pork",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_with_salad
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Smash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tuna",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals5(idNumber: Int = 750): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Chicken breast marinade in olive oil ",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 241,
            mealImage = R.drawable.chicken_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Pommes frites",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 134,
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Eag",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(100),
            mealImage = R.drawable.eag
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Mash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals6(idNumber: Int = 755): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Roast pork",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_with_salad
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Smash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tuna",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals7(idNumber: Int = 760): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Fish and french fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Pork chop",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Veal fillet",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_meat_with_pasta
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tortellini",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals8(idNumber: Int = 765): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Roast pork",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_with_salad
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Smash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tuna",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals9(idNumber: Int = 770): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Chicken breast marinade in olive oil ",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 241,
            mealImage = R.drawable.chicken_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Pommes frites",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 134,
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Eag",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(100),
            mealImage = R.drawable.eag
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Mash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals10(idNumber: Int = 775): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Roast pork",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_with_salad
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Smash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tuna",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals11(idNumber: Int = 780): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Chicken breast marinade in olive oil ",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 241,
            mealImage = R.drawable.chicken_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Pommes frites",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 134,
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Eag",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(100),
            mealImage = R.drawable.eag
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Mash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals12(idNumber: Int = 785): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Roast pork",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_with_salad
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Smash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tuna",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals13(idNumber: Int = 790): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Fish and french fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Pork chop",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Veal fillet",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_meat_with_pasta
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tortellini",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals14(idNumber: Int = 795): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Roast pork",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_with_salad
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Smash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tuna",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals15(idNumber: Int = 800): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Chicken breast marinade in olive oil ",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 241,
            mealImage = R.drawable.chicken_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Pommes frites",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 134,
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Eag",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(100),
            mealImage = R.drawable.eag
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Mash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals16(idNumber: Int = 805): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Roast pork",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_with_salad
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Smash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tuna",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals17(idNumber: Int = 810): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Fish and french fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Pork chop",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Veal fillet",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_meat_with_pasta
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tortellini",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals18(idNumber: Int = 815): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Roast pork",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_with_salad
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Smash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tuna",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals19(idNumber: Int = 820): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Chicken breast marinade in olive oil ",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 241,
            mealImage = R.drawable.chicken_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Pommes frites",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 134,
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Eag",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(100),
            mealImage = R.drawable.eag
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Mash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals20(idNumber: Int = 825): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Roast pork",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_with_salad
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Smash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tuna",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals21(idNumber: Int = 830): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Roast pork",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_with_salad
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Smash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tuna",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}
private fun additionMeals22(idNumber: Int = 835): Food {
    val mealNutrition: List<Nutrition> = getNutrition()
    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Roast pork",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_with_salad
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Smash potato",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.smash_potato
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "French fries",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Tuna",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.generic_food_img
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Risotto",
            mealDescription = "Additional meal",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        )
    )

    return Food(
        foodCategory = FoodCategory.ADDITIONAL_MEALS,
        MealList = mealList

    )
}

private fun menu1(idNumber: Int = 620): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Tortellini with cheese, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Tomato soup, Fish and french fries, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Tomato soup, Chicken with pasta, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_pasta

        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu2(idNumber: Int = 625): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Clear soup, Chicken with rise, Salad, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_rise
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Bolognes, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.bolognes
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Tomato soup, Tortellini, Salad, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Pumpkin soup, Fish and pommes frites, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu3(idNumber: Int = 630): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Green soup, Tortellini with cheese, Salad, Cake",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Chicken with broccoli, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_pasta
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Green soup, Risotto, Salad, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu4(idNumber: Int = 635): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Green soup, Meatballs with smash potato, Salad, Cake",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.meatballs_with_potato
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Green soup, Pork meat with pasta, Salad, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_meat_with_pasta
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Clear soup, Bolognes, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.bolognes
        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu5(idNumber: Int = 640): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Tortellini with cheese, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Tomato soup, Fish and french fries, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Tomato soup, Chicken with pasta, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_pasta

        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu6(idNumber: Int = 645): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Tortellini with cheese, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Tomato soup, Fish and french fries, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Tomato soup, Chicken with pasta, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_pasta

        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu7(idNumber: Int = 650): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Clear soup, Chicken with rise, Salad, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_rise
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Bolognes, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.bolognes
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Tomato soup, Tortellini, Salad, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Pumpkin soup, Fish and pommes frites, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu8(idNumber: Int = 655): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Green soup, Tortellini with cheese, Salad, Cake",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Chicken with broccoli, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_pasta
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Green soup, Risotto, Salad, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu9(idNumber: Int = 660): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Green soup, Meatballs with smash potato, Salad, Cake",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.meatballs_with_potato
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Green soup, Pork meat with pasta, Salad, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_meat_with_pasta
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Clear soup, Bolognes, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.bolognes
        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu10(idNumber: Int = 665): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Tortellini with cheese, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Tomato soup, Fish and french fries, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Tomato soup, Chicken with pasta, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_pasta

        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu11(idNumber: Int = 670): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Tortellini with cheese, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Tomato soup, Fish and french fries, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Tomato soup, Chicken with pasta, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_pasta

        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu12(idNumber: Int = 675): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Clear soup, Chicken with rise, Salad, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_rise
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Bolognes, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.bolognes
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Tomato soup, Tortellini, Salad, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Pumpkin soup, Fish and pommes frites, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu13(idNumber: Int = 680): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Green soup, Tortellini with cheese, Salad, Cake",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Chicken with broccoli, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_pasta
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Green soup, Risotto, Salad, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu14(idNumber: Int = 685): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Green soup, Meatballs with smash potato, Salad, Cake",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.meatballs_with_potato
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Green soup, Pork meat with pasta, Salad, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_meat_with_pasta
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Clear soup, Bolognes, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.bolognes
        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu15(idNumber: Int = 690): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Tortellini with cheese, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Tomato soup, Fish and french fries, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Tomato soup, Chicken with pasta, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_pasta

        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu16(idNumber: Int = 695): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Tortellini with cheese, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Tomato soup, Fish and french fries, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Tomato soup, Chicken with pasta, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_pasta

        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu17(idNumber: Int = 700): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Clear soup, Chicken with rise, Salad, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_rise
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Bolognes, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.bolognes
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Tomato soup, Tortellini, Salad, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Pumpkin soup, Fish and pommes frites, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu18(idNumber: Int = 705): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Green soup, Tortellini with cheese, Salad, Cake",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Chicken with broccoli, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_pasta
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Green soup, Risotto, Salad, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.risotto
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu19(idNumber: Int = 710): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Green soup, Meatballs with smash potato, Salad, Cake",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.meatballs_with_potato
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Green soup, Pork meat with pasta, Salad, Orange",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.pork_meat_with_pasta
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Clear soup, Bolognes, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.bolognes
        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu20(idNumber: Int = 715): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Tortellini with cheese, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Tomato soup, Fish and french fries, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Tomato soup, Chicken with pasta, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_pasta

        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu21(idNumber: Int = 720): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Tortellini with cheese, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Tomato soup, Fish and french fries, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Tomato soup, Chicken with pasta, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_pasta

        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}
private fun menu22(idNumber: Int = 725): Food {
    val mealNutrition: List<Nutrition> = getNutrition(valueP = 94, valueC = 764)

    val mealAllergens: List<Allergens> = getAllergens()

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Menu 1",
            mealDescription = "Clear soup, Beans with sausages, Yogurt",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.grah_s_kobasicama
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Menu 2",
            mealDescription = "Clear soup, Tortellini with cheese, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.tortelini_with_cheese
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Menu 3",
            mealDescription = "Tomato soup, Fish and french fries, Salad, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.fish_and_french_fries
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Menu 4",
            mealDescription = "Tomato soup, Chicken with pasta, Banana",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = Random.nextInt(200),
            mealImage = R.drawable.chicken_with_pasta

        ),
    )

    return Food(
        foodCategory = FoodCategory.MENUS,
        MealList = mealList
    )
}


fun getOthers1(idNumber: Int = 510): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers2(idNumber: Int = 515): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers3(idNumber: Int = 520): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers4(idNumber: Int = 525): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers5(idNumber: Int = 530): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers6(idNumber: Int = 535): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers7(idNumber: Int = 540): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers8(idNumber: Int = 545): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers9(idNumber: Int = 550): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers10(idNumber: Int = 555): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers11(idNumber: Int = 560): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers12(idNumber: Int = 565): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers13(idNumber: Int = 570): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers14(idNumber: Int = 575): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers15(idNumber: Int = 580): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers16(idNumber: Int = 585): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers17(idNumber: Int = 590): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers18(idNumber: Int = 595): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers19(idNumber: Int = 600): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers20(idNumber: Int = 605): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers21(idNumber: Int = 610): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}
fun getOthers22(idNumber: Int = 615): Food {
    val mealNutrition: List<Nutrition> = getNutrition(24, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Milk"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Yogurt",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.yogurt
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Sour cream",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.sour_cream
        ),
    )

    return Food(
        foodCategory = FoodCategory.OTHERS,
        MealList = mealList
    )
}

fun getDeserts1(): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = 63,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = 64,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = 65,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = 66,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts2(): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = 67,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = 68,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = 69,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = 70,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts3(): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = 71,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = 72,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = 73,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = 74,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts4(): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = 76,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = 77,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = 78,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = 79,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts5(idNumber: Int = 330): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts6(idNumber: Int = 340): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts7(idNumber: Int = 350): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts8(idNumber: Int = 370): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts9(idNumber: Int = 380): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts10(idNumber: Int = 380): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts11(idNumber: Int = 390): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts12(idNumber: Int = 400): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts13(idNumber: Int = 410): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts14(idNumber: Int = 420): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts15(idNumber: Int = 430): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts16(idNumber: Int = 440): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts17(idNumber: Int = 450): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts18(idNumber: Int = 460): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts19(idNumber: Int = 470): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts20(idNumber: Int = 480): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts21(idNumber: Int = 490): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}
fun getDeserts22(idNumber: Int = 500): Food {
    val mealNutrition: List<Nutrition> = getNutrition(10, 234, 5)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Peanuts"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Citrus allergy"),
            mealWeight = 160,
            mealImage = R.drawable.orange_img
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Apple",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Pollinosis"),
            mealWeight = 160,
            mealImage = R.drawable.apple
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Banana",
            mealDescription = "Fruit",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("Profilin"),
            mealWeight = 164,
            mealImage = R.drawable.banana_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Chocolate croissant",
            mealDescription = "Sweets",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 324,
            mealImage = R.drawable.croassiant
        )
    )

    return Food(
        foodCategory = FoodCategory.DESERTS,
        MealList = mealList
    )
}



fun getDrinks1(): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = 80,
            mealName = "Orange juice",
            mealDescription = "Drink",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = 81,
            mealName = "Peach juice",
            mealDescription = "Drink",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = 82,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = 83,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = 84,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks2(): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = 85,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = 86,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = 87,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = 88,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = 90,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks3(): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = 91,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = 92,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = 93,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = 94,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = 95,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks4(): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = 96,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = 97,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = 98,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = 99,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = 100,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks5(idNumber: Int = 200): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks6(idNumber: Int = 206): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks7(idNumber: Int = 212): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks8(idNumber: Int = 220): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks9(idNumber: Int = 370): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks10(idNumber: Int = 360): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks11(idNumber: Int = 350): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks12(idNumber: Int = 340): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks13(idNumber: Int = 330): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks14(idNumber: Int = 240): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks15(idNumber: Int = 252): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks16(idNumber: Int = 260): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks17(idNumber: Int = 272): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks18(idNumber: Int = 280): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks19(idNumber: Int = 290): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks20(idNumber: Int = 300): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks21(idNumber: Int = 310): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}
fun getDrinks22(idNumber: Int = 320): Food {
    val mealNutrition: List<Nutrition> = getNutrition(3, 134, 4)

    val mealAllergens: List<Allergens> = listOf(
        Allergens(
            name = "Orange"
        )
    )

    val mealList: List<Meal> = listOf(
        Meal(
            mealId = idNumber+1,
            mealName = "Orange juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.cappy
        ),
        Meal(
            mealId = idNumber+2,
            mealName = "Peach juice",
            mealDescription = "Juice",
            mealNutrition = mealNutrition,
            mealAllergens = getAllergens("non"),
            mealWeight = 200,
            mealImage = R.drawable.breskva_img
        ),
        Meal(
            mealId = idNumber+3,
            mealName = "Water",
            mealDescription = "Drink",
            mealNutrition = getNutrition(0,0,0),
            mealAllergens = getAllergens("non"),
            mealWeight = 500,
            mealImage = R.drawable.water_img
        ),
        Meal(
            mealId = idNumber+4,
            mealName = "Milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.mlijeko
        ),
        Meal(
            mealId = idNumber+5,
            mealName = "Choco milk",
            mealDescription = "Milk product",
            mealNutrition = mealNutrition,
            mealAllergens = mealAllergens,
            mealWeight = 200,
            mealImage = R.drawable.choco_milk
        )
    )

    return Food(
        foodCategory = FoodCategory.DRINKS,
        MealList = mealList
    )
}


