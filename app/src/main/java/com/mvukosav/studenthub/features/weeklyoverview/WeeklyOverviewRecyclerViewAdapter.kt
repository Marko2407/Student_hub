package com.mvukosav.studenthub.features.weeklyoverview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mvukosav.studenthub.databinding.LayoutFoodByDayTypeBinding
import com.mvukosav.studenthub.domain.models.Day
import com.mvukosav.studenthub.domain.models.WeeklySelectedMeals

class WeeklyOverviewRecyclerViewAdapter(
    val context: Context,
    private val mealClickListener: OnWeeklyOverviewDayClickListener,
) :
    RecyclerView.Adapter<OverviewViewHolder>() {
    private var dailyMenu: MutableList<WeeklySelectedMeals> = mutableListOf()
    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OverviewViewHolder {
        val inflatedBinding: LayoutFoodByDayTypeBinding =
            LayoutFoodByDayTypeBinding.inflate(layoutInflater, parent, false)
        return OverviewViewHolder(inflatedBinding, mealClickListener)
    }

    override fun getItemCount(): Int = dailyMenu.size

    override fun onBindViewHolder(holder: OverviewViewHolder, position: Int) {
        holder.bind(dailyMenu[position])
    }

    fun swapList(newDaily: List<WeeklySelectedMeals>) {
        val diffCallback = SelectedFoodDiffCallback(this.dailyMenu, newDaily)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        this.dailyMenu.clear()
        this.dailyMenu.addAll(newDaily)
        diffResult.dispatchUpdatesTo(this)
    }

}

class OverviewViewHolder(
    private val binding: LayoutFoodByDayTypeBinding,
    private val onMealClickListener: OnWeeklyOverviewDayClickListener
) : RecyclerView.ViewHolder(binding.root) {
    val context: Context = itemView.context

    init {
        binding.recyclerViewRowFood.apply {
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }
    }

    fun bind(model: WeeklySelectedMeals) {
        binding.foodCategory.text = model.day.name + " ${model.date} "
        binding.recyclerViewRowFood.adapter = WeeklyOverviewRowRecyclerViewAdapter(
            context,
            model.dailySelectedMeals,
            model.totalCaloriesPerDayType
        )
        binding.root.setOnClickListener {
            onMealClickListener.onDayClicked(model.date)
        }
        binding.clickMe.setOnClickListener {
            onMealClickListener.onDayClicked(model.date)
        }
    }
}

class SelectedFoodDiffCallback(
    private val oldItem: List<WeeklySelectedMeals>,
    private val newItem: List<WeeklySelectedMeals>
) :
    DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldItem.size

    override fun getNewListSize(): Int = newItem.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldItem[oldItemPosition].date == newItem[newItemPosition].date

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldItem[oldItemPosition] == newItem[newItemPosition]
}

interface OnWeeklyOverviewDayClickListener {
    fun onDayClicked(date: String)
}

