package com.mvukosav.studenthub.utils

import android.view.View

fun View.setVisible() {
    visibility = View.VISIBLE
}

fun View.setGone() {
    visibility = View.GONE
}

fun View.setVisibleElseGone(isVisible: Boolean) {
    if (isVisible) {
        setVisible()
    } else {
        setGone()
    }
}