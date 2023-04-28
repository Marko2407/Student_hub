package com.mvukosav.studenthub.domain.interactors

import com.mvukosav.studenthub.domain.models.Week
import com.mvukosav.studenthub.domain.models.WeeklyMenu
import com.mvukosav.studenthub.domain.repositories.FoodRepository
import com.mvukosav.studenthub.network.Response
import javax.inject.Inject

class GetWeekDays @Inject constructor(private val foodRepository: FoodRepository) {

    operator fun invoke(): List<Week> = foodRepository.getWeekDays()
}