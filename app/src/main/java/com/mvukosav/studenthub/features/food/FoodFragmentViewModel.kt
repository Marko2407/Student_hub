package com.mvukosav.studenthub.features.food

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mvukosav.studenthub.domain.interactors.GetDayAndTypeOfDay
import com.mvukosav.studenthub.domain.interactors.GetDayCategoryDailyFood
import com.mvukosav.studenthub.domain.interactors.GetMealById
import com.mvukosav.studenthub.domain.interactors.GetWeekDays
import com.mvukosav.studenthub.domain.interactors.GetWeeklyFood
import com.mvukosav.studenthub.domain.interactors.MealSelected
import com.mvukosav.studenthub.domain.interactors.SetSelectedDay
import com.mvukosav.studenthub.domain.interactors.SetSelectedTypeOfDay
import com.mvukosav.studenthub.domain.models.CategoryDay
import com.mvukosav.studenthub.domain.models.DailyMenu
import com.mvukosav.studenthub.domain.models.Day
import com.mvukosav.studenthub.domain.models.Meal
import com.mvukosav.studenthub.domain.models.Week
import com.mvukosav.studenthub.network.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class FoodFragmentViewModel @Inject constructor(
    private val getWeeklyFood: GetWeeklyFood,
    private val fetchMealById: GetMealById,
    private val getWeekDays: GetWeekDays,
    private val getDailyFoodByDayCategory: GetDayCategoryDailyFood,
    private val setSelectedDay: SetSelectedDay,
    private val setSelectedTypeOfDay: SetSelectedTypeOfDay,
    private val onMealSelected: MealSelected,
    private val getDayAndTypeOfDay: GetDayAndTypeOfDay
) : ViewModel() {

    private val errorLiveData = MutableLiveData<String?>()
    val fetchErrorLiveData: LiveData<String?> = errorLiveData

    private val dailyFoodLiveData = MutableLiveData<DailyMenu?>()
    val fetchDailyFoodLiveData: LiveData<DailyMenu?> = dailyFoodLiveData

    private val mealByIdLiveData = MutableLiveData<Meal?>()
    val fetchMealByIdLiveData: LiveData<Meal?> = mealByIdLiveData

    private val numberOfSelectedMeals = MutableLiveData<Int>()
    val fetchNumberOfSelectedMealsLiveData: LiveData<Int> = numberOfSelectedMeals

    private val weekDaysLiveData = MutableLiveData<List<Week>?>()
    val fetchWeekDaysLiveData: LiveData<List<Week>?> = weekDaysLiveData

    private val selectedDateLiveData = MutableLiveData<String>()
    val fetchSelectedDateLiveData: LiveData<String> = selectedDateLiveData

    init {
        initDataFetch()
    }

    fun initDataFetch() {
        viewModelScope.launch {
            withContext(viewModelScope.coroutineContext) {
                when (val response = getWeeklyFood()) {
                    is Response.Result -> {
                        fetchDailyFood()
                        fetchSelectedDate()
                        fetchWeekDays()
                    }
                    is Response.Error -> {
                        errorLiveData.postValue(response.message)
                    }
                    is Response.ErrorApi -> {
                        errorLiveData.postValue(response.error.name)
                    }
                    is Response.NetworkError -> {
                        errorLiveData.postValue("Please check your network")
                    }
                }
            }
        }
    }

    fun fetchDailyFood() {
        viewModelScope.launch {
            dailyFoodLiveData.postValue(getDailyFoodByDayCategory())
        }
        fetchSelectedDate()
    }

    private fun fetchWeekDays() {
        weekDaysLiveData.postValue(getWeekDays())
    }

    private fun fetchSelectedDate() {
        selectedDateLiveData.postValue(getDayAndTypeOfDay())
    }

    fun onDaySelected(day: Day) {
        setSelectedDay(day)
        numberOfSelectedMeals.postValue(onMealSelected(-1))
        viewModelScope.launch {
            fetchDailyFood()
        }
    }

    fun onDayCategorySelected(dayPart: CategoryDay) {
        setSelectedTypeOfDay(dayPart)
        viewModelScope.launch {
            fetchDailyFood()
        }
    }

    fun getMealById(mealId: Int) {
        mealByIdLiveData.postValue(fetchMealById(mealId))
    }

    fun onMealSelect(mealId: Int) {
        val selectedMealNumber = onMealSelected(mealId)
        numberOfSelectedMeals.postValue(selectedMealNumber)
    }
}
