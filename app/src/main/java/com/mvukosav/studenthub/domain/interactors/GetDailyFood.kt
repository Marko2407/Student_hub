package com.mvukosav.studenthub.domain.interactors

import com.mvukosav.studenthub.domain.models.DailyMenu
import com.mvukosav.studenthub.domain.models.Day
import com.mvukosav.studenthub.domain.repositories.FoodRepository
import javax.inject.Inject

// daily food
class GetDailyFood @Inject constructor(private val foodRepository: FoodRepository) {

    suspend operator fun invoke(day: Day): List<DailyMenu> =
        foodRepository.getMenuByDay(day)
}