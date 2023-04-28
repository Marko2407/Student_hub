package com.mvukosav.studenthub.domain.interactors

import com.mvukosav.studenthub.domain.models.CategoryDay
import com.mvukosav.studenthub.domain.repositories.FoodRepository
import javax.inject.Inject

class SetSelectedTypeOfDay @Inject constructor(private val foodRepository: FoodRepository) {

    operator fun invoke(categoryDay: CategoryDay) = foodRepository.onTypeOfDaySelected(categoryDay)
}