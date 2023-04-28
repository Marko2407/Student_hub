package com.mvukosav.studenthub.utils

import android.widget.TextView
import com.mvukosav.studenthub.domain.models.Allergens
import com.mvukosav.studenthub.domain.models.Nutrition

fun TextView.nutritionListToText(list: List<Nutrition>) {
    var text = ""
    val listOfLabelValue = listOf("kcal, ", "g, ", "g ")
    var indexOfLabels = 0
    list.forEachIndexed { index, nutrition ->
        text += "" + nutrition.name + " " + nutrition.value + listOfLabelValue[indexOfLabels]
        indexOfLabels++
    }

    setText(text)
}

fun TextView.allergensListToText(list: List<Allergens>) {
    var text = "Allergens:"
    list.forEach {
        text += " " + it.name + " "
    }
    setText(text)
}

fun TextView.separateText(inputText: String?) {
    val separated = inputText?.replace(",", "\n• ")
    setText("•  $separated")
}

fun TextView.totalNutritionListToText(list: List<Nutrition>) {
    var text = ""
    val listOfLabelValue = listOf("kcal, ", "g, ", "g ")
    var indexOfLabels = 0
    list.forEachIndexed { index, nutrition ->
        val sp = if (listOfLabelValue.lastIndex != index) "\n" else ""
        text += nutrition.name + ": " + nutrition.value + listOfLabelValue[indexOfLabels] + sp

        indexOfLabels++
    }

    setText(text)
}
