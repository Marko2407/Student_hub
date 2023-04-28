package com.mvukosav.studenthub.domain.interactors

import com.mvukosav.studenthub.domain.repositories.FoodRepository
import javax.inject.Inject

class GetDayAndTypeOfDay @Inject constructor(private val foodRepository: FoodRepository) {

    operator fun invoke(): String = foodRepository.getSelectedDate()
}