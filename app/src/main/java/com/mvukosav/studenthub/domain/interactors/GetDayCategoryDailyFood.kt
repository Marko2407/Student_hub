package com.mvukosav.studenthub.domain.interactors

import com.mvukosav.studenthub.domain.models.CategoryDay
import com.mvukosav.studenthub.domain.models.DailyMenu
import com.mvukosav.studenthub.domain.models.Day
import com.mvukosav.studenthub.domain.repositories.FoodRepository
import javax.inject.Inject

// daily food
class GetDayCategoryDailyFood @Inject constructor(private val foodRepository: FoodRepository) {

    suspend operator fun invoke(): DailyMenu? = foodRepository.getFoodByDayCategory()
}