package com.mvukosav.studenthub.utils

import android.content.Context

object ConvertUtil {

    fun dpToPx(context: Context, dp: Int): Int {
        return (dp * context.resources.displayMetrics.density).toInt()
    }
}