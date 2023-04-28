package com.mvukosav.studenthub.domain.interactors

import com.mvukosav.studenthub.domain.models.WeeklyMenu
import com.mvukosav.studenthub.domain.repositories.FoodRepository
import com.mvukosav.studenthub.network.Response
import javax.inject.Inject

class GetWeeklyFood @Inject constructor(private val foodRepository: FoodRepository) {

    suspend operator fun invoke(): Response<List<WeeklyMenu>> = foodRepository.getWeeklyMenu()
}