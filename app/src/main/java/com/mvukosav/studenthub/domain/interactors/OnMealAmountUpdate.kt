package com.mvukosav.studenthub.domain.interactors

import com.mvukosav.studenthub.domain.models.DailySelectedMeal
import com.mvukosav.studenthub.domain.repositories.FoodRepository
import javax.inject.Inject

class OnMealAmountUpdate @Inject constructor(private val foodRepository: FoodRepository) {

    operator fun invoke(mealId:Int, amount: Int): List<DailySelectedMeal> = foodRepository.updateMealAmount(mealId, amount)
}