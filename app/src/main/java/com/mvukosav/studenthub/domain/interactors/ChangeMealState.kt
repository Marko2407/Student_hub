package com.mvukosav.studenthub.domain.interactors

import com.mvukosav.studenthub.domain.repositories.FoodRepository
import javax.inject.Inject

class MealSelected @Inject constructor(private val foodRepository: FoodRepository) {

    operator fun invoke(mealId: Int): Int =
        foodRepository.onMealSelected(mealId)
}