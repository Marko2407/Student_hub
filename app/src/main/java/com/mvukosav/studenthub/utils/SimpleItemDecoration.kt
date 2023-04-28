package com.mvukosav.studenthub.utils

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.mvukosav.studenthub.utils.ConvertUtil

class SimpleHorizontalItemDecoration(context: Context, space: Int, start: Int) : RecyclerView.ItemDecoration() {

    private val spaceInDp = ConvertUtil.dpToPx(context, space)
    private val startInDp = ConvertUtil.dpToPx(context, 20)

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        outRect.right = spaceInDp
        outRect.bottom = startInDp
        // Add top margin only for the first item to avoid double space between items
    }
}
