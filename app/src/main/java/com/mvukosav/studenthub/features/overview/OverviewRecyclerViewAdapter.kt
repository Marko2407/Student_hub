package com.mvukosav.studenthub.features.overview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mvukosav.studenthub.databinding.LayoutFoodByDayTypeBinding
import com.mvukosav.studenthub.domain.models.DailySelectedMeal
import com.mvukosav.studenthub.utils.setGone

class OverviewRecyclerViewAdapter(
    val context: Context,
    private val mealClickListener: OnOverviewMealClickListener,
) :
    RecyclerView.Adapter<OverviewViewHolder>() {
    private var dailyMenu: List<DailySelectedMeal> = mutableListOf()
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

    fun swapList(newDaily: List<DailySelectedMeal>) {
        val diffCallback = SelectedFoodDiffCallback(this.dailyMenu, newDaily)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        this.dailyMenu = newDaily
        diffResult.dispatchUpdatesTo(this)
    }

}

class OverviewViewHolder(
    private val binding: LayoutFoodByDayTypeBinding,
    private val onMealClickListener: OnOverviewMealClickListener
) : RecyclerView.ViewHolder(binding.root) {
    val context: Context = itemView.context

    init {
        binding.recyclerViewRowFood.apply {
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }
    }

    fun bind(model: DailySelectedMeal) {
        binding.foodCategory.text = model.dayType.title

        if (model.selectedMeals.isEmpty()) binding.apply {
            foodCategory.setGone()
            horizontalDivider.setGone()
        }

        binding.recyclerViewRowFood.adapter =
            OverviewRowRecyclerViewAdapter(context, model.selectedMeals, onMealClickListener)
    }
}

class SelectedFoodDiffCallback(
    private val oldItem: List<DailySelectedMeal>,
    private val newItem: List<DailySelectedMeal>
) :
    DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldItem.size

    override fun getNewListSize(): Int = newItem.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldItem[oldItemPosition].dayType == newItem[newItemPosition].dayType

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldItem[oldItemPosition] == newItem[newItemPosition]
}

interface OnOverviewMealClickListener {
    fun onMealClicked(mealId: Int, number: Int)
}

