package com.mvukosav.studenthub.features.weeklyoverview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mvukosav.studenthub.domain.interactors.GetWeeklySelectedDailyFood
import com.mvukosav.studenthub.domain.models.WeeklySelectedMeals
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WeeklyOverviewViewModel @Inject constructor(
    private val getWeeklySelectedDailyFood: GetWeeklySelectedDailyFood,
) : ViewModel() {

    private val selectedWeeklyFoodLiveData = MutableLiveData<List<WeeklySelectedMeals>?>()
    val fetchSelectedWeeklyFoodLiveData: LiveData<List<WeeklySelectedMeals>?> =
        selectedWeeklyFoodLiveData

    init {
        fetchSelectedFood()
    }

    fun fetchSelectedFood() {
        selectedWeeklyFoodLiveData.postValue(getWeeklySelectedDailyFood())
    }

    fun onDayClicked(mealId: Int) {}
}
