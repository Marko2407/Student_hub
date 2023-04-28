package com.mvukosav.studenthub.domain.interactors

import com.mvukosav.studenthub.domain.models.CategoryDay
import com.mvukosav.studenthub.domain.models.DailyMenu
import com.mvukosav.studenthub.domain.models.DailySelectedMeal
import com.mvukosav.studenthub.domain.models.Day
import com.mvukosav.studenthub.domain.models.WeeklySelectedMeals
import com.mvukosav.studenthub.domain.repositories.FoodRepository
import javax.inject.Inject

// daily food
class GetWeeklySelectedDailyFood @Inject constructor(private val foodRepository: FoodRepository) {

    operator fun invoke(): List<WeeklySelectedMeals> = foodRepository.getWeeklySelectedFood()
}