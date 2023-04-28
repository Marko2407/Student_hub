package com.mvukosav.studenthub.domain.interactors

import com.mvukosav.studenthub.domain.models.Meal
import com.mvukosav.studenthub.domain.repositories.FoodRepository
import javax.inject.Inject

class GetMealById @Inject constructor(private val foodRepository: FoodRepository) {

    operator fun invoke(mealId: Int): Meal? = foodRepository.getMealById(mealId)
}