package com.mvukosav.studenthub.domain.interactors

import com.mvukosav.studenthub.domain.models.CategoryDay
import com.mvukosav.studenthub.domain.models.DailyMenu
import com.mvukosav.studenthub.domain.models.DailySelectedMeal
import com.mvukosav.studenthub.domain.models.Day
import com.mvukosav.studenthub.domain.repositories.FoodRepository
import javax.inject.Inject

// Get selected food in day by day category
class GetSelectedDailyFood @Inject constructor(private val foodRepository: FoodRepository) {

    operator fun invoke(date: String): List<DailySelectedMeal> = foodRepository.getSelectedMeals(date)
}