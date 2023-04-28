package com.mvukosav.studenthub.features.weeklyoverview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mvukosav.studenthub.databinding.LayoutTotalWeeklyOverviewBinding
import com.mvukosav.studenthub.domain.models.DailySelectedMeal
import com.mvukosav.studenthub.domain.models.Nutrition
import com.mvukosav.studenthub.utils.totalNutritionListToText

class WeeklyOverviewRowRecyclerViewAdapter(
    context: Context,
    private val mealList: List<DailySelectedMeal>,
    private val totalCaloriesPerDayType: List<Nutrition>
) :
    RecyclerView.Adapter<OverviewRowViewHolder>() {
    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OverviewRowViewHolder {
        val inflatedBinding: LayoutTotalWeeklyOverviewBinding =
            LayoutTotalWeeklyOverviewBinding.inflate(layoutInflater, parent, false)
        return OverviewRowViewHolder(inflatedBinding)
    }

    override fun getItemCount(): Int = mealList.size

    override fun onBindViewHolder(holder: OverviewRowViewHolder, position: Int) {
        holder.bind(totalCaloriesPerDayType)
    }
}

class OverviewRowViewHolder(
    private val binding: LayoutTotalWeeklyOverviewBinding
) :
    RecyclerView.ViewHolder(binding.root) {
    val context: Context = itemView.context

    fun bind(model: List<Nutrition>) {
        binding.content.totalNutritionListToText(model)

    }
}
