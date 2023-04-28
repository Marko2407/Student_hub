package com.mvukosav.studenthub.utils

import com.mvukosav.studenthub.domain.models.CategoryDay
import com.mvukosav.studenthub.domain.models.Day
import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime
import java.util.Date
import java.util.Locale

/**
 * This object provides methods for time management
 */
object TimeUtil {
    fun convertLongToTime(time: Long): String {
        val date = Date(time)
        val format = SimpleDateFormat("yyyy", Locale.getDefault())
        return format.format(date)
    }

    fun getWeekRange(): MutableList<LocalDate> {
        // Get today's date
        val today = LocalDate.now()

        // Get the first day of the week (Monday) using the DayOfWeek enum
        val firstDayOfWeek = today.with(DayOfWeek.MONDAY)

        // Create a list to store the days of the week
        val daysOfWeek = mutableListOf<LocalDate>()

        // Add each day of the week to the list
        for (i in 0..6) {
            val dayOfWeek = firstDayOfWeek.plusDays(i.toLong())
            daysOfWeek.add(dayOfWeek)
        }

        // Print the list of days of the week
        println("Days of the week from Monday to Sunday:")
        for (day in daysOfWeek) {
            println(day)
        }
        return daysOfWeek
    }

    fun isTimeBetween(time: LocalTime, start: LocalTime, end: LocalTime): Boolean {
        return time.isAfter(start) && time.isBefore(end)
    }

    fun isToday(day: Day): Boolean {
        val today: DayOfWeek = LocalDate.now().dayOfWeek
        return day.name == today.name
    }

    fun getFoodTypeOfDay(): CategoryDay {
        var isBreakFastTime =
            isTimeBetween(LocalTime.now(), LocalTime.of(0, 0), LocalTime.of(10, 59))
        val isLunchTime = isTimeBetween(LocalTime.now(), LocalTime.of(11, 0), LocalTime.of(17, 59))
        val isDinnerTime = isTimeBetween(LocalTime.now(), LocalTime.of(18, 0), LocalTime.of(23, 59))

        return if (isLunchTime) CategoryDay.LUNCH
        else if(isDinnerTime) CategoryDay.DINNER
        else CategoryDay.BREAKFAST
    }
}