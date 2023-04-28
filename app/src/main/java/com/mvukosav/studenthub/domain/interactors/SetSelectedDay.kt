package com.mvukosav.studenthub.domain.interactors

import com.mvukosav.studenthub.domain.models.Day
import com.mvukosav.studenthub.domain.models.Meal
import com.mvukosav.studenthub.domain.repositories.FoodRepository
import javax.inject.Inject

class SetSelectedDay @Inject constructor(private val foodRepository: FoodRepository) {

    operator fun invoke(day: Day) = foodRepository.onDaySelected(day)
}