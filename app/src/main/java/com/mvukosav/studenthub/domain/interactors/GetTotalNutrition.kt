package com.mvukosav.studenthub.domain.interactors

import com.mvukosav.studenthub.domain.models.Nutrition
import com.mvukosav.studenthub.domain.repositories.FoodRepository
import javax.inject.Inject

class GetTotalNutrition @Inject constructor(private val foodRepository: FoodRepository) {

    operator fun invoke(): List<Nutrition> = foodRepository.getTotalNutrition()
}