package com.mvukosav.studenthub.features.overview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mvukosav.studenthub.databinding.LayoutOverviewFoodItemBinding
import com.mvukosav.studenthub.domain.models.Meal
import com.mvukosav.studenthub.domain.models.SelectedMeal

class OverviewRowRecyclerViewAdapter(
    context: Context,
    private val mealList: List<SelectedMeal>,
    private val mealClickListener: OnOverviewMealClickListener
) :
    RecyclerView.Adapter<OverviewRowViewHolder>() {
    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OverviewRowViewHolder {
        val inflatedBinding: LayoutOverviewFoodItemBinding =
            LayoutOverviewFoodItemBinding.inflate(layoutInflater, parent, false)
        return OverviewRowViewHolder(inflatedBinding, mealClickListener)
    }

    override fun getItemCount(): Int = mealList.size

    override fun onBindViewHolder(holder: OverviewRowViewHolder, position: Int) {
        holder.bind(mealList[position])
    }
}

class OverviewRowViewHolder(
    private val binding: LayoutOverviewFoodItemBinding,
    private val mealClickListener: OnOverviewMealClickListener
) :
    RecyclerView.ViewHolder(binding.root) {
    val context: Context = itemView.context

    fun bind(model: SelectedMeal) {
        if(model.meal.mealName.contains("Menu")){
            binding.mealDescription.text = model.meal.mealDescription
        }else{
            binding.mealDescription.text = model.meal.mealName
        }

        binding.layoutMealNumber.addMeal.setOnClickListener {
            mealClickListener.onMealClicked(model.meal.mealId, 1)
            binding.layoutMealNumber.mealNumber.text = model.mealAmount.toString()
        }

        binding.layoutMealNumber.removeMeal.setOnClickListener {
            mealClickListener.onMealClicked(model.meal.mealId, -1)
            binding.layoutMealNumber.mealNumber.text = model.mealAmount.toString()
        }

        binding.layoutMealNumber.mealNumber.text = model.mealAmount.toString()
    }
}
