package com.mvukosav.studenthub.features.overview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mvukosav.studenthub.domain.interactors.GetSelectedDailyFood
import com.mvukosav.studenthub.domain.interactors.GetTotalNutrition
import com.mvukosav.studenthub.domain.interactors.OnMealAmountUpdate
import com.mvukosav.studenthub.domain.models.DailySelectedMeal
import com.mvukosav.studenthub.domain.models.Nutrition
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OverviewViewModel @Inject constructor(
    private val getSelectedDailyFood: GetSelectedDailyFood,
    private val onMealAmountUpdate: OnMealAmountUpdate,
    private val getTotalNutrition: GetTotalNutrition
) : ViewModel() {

    private val selectedFoodLiveData = MutableLiveData<List<DailySelectedMeal>?>()
    val fetchSelectedFoodLiveData: LiveData<List<DailySelectedMeal>?> = selectedFoodLiveData

    private val totalFoodNutrition = MutableLiveData<List<Nutrition>?>()
    val fetchTotalFoodNutritionLiveData: LiveData<List<Nutrition>?> = totalFoodNutrition

    fun fetchSelectedFood(selectedDate: String) {
        selectedFoodLiveData.postValue(getSelectedDailyFood(selectedDate))
        fetchNutrition()
    }

    fun onMealUpdate(mealId: Int, number: Int) {
        selectedFoodLiveData.postValue(onMealAmountUpdate(mealId, number))
        fetchNutrition()
    }

    fun fetchNutrition() {
        totalFoodNutrition.postValue(getTotalNutrition())
    }
}
