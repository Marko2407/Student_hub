package com.mvukosav.studenthub.features.food

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.mvukosav.studenthub.R
import com.mvukosav.studenthub.databinding.LayoutFoodItemBinding
import com.mvukosav.studenthub.databinding.LayoutFoodMenuItemBinding
import com.mvukosav.studenthub.domain.models.Meal
import com.mvukosav.studenthub.utils.nutritionListToText
import com.mvukosav.studenthub.utils.separateText

class FoodRowRecyclerViewAdapter(
    context: Context,
    private val mealList: List<Meal>,
    private val isMenuItems: Boolean,
    private val mealClickListener: OnMealClickListener
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_TYPE_MENU) {
            val inflatedView: LayoutFoodMenuItemBinding = LayoutFoodMenuItemBinding.inflate(
                layoutInflater,
                parent,
                false
            )
            MenuFoodRowViewHolder(inflatedView, mealClickListener)
        } else {
            val inflatedView: LayoutFoodItemBinding = LayoutFoodItemBinding.inflate(
                layoutInflater,
                parent,
                false
            )
            NormalFoodRowViewHolder(inflatedView, mealClickListener)
        }
    }

    override fun getItemCount(): Int = mealList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == VIEW_TYPE_MENU) {
            (holder as MenuFoodRowViewHolder).bind(mealList[position])
        } else {
            (holder as NormalFoodRowViewHolder).bind(mealList[position])
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (isMenuItems) VIEW_TYPE_MENU else VIEW_TYPE_NORMAL
    }

    companion object {
        private const val VIEW_TYPE_MENU = 0
        private const val VIEW_TYPE_NORMAL = 1
    }
}

class NormalFoodRowViewHolder(
    private val binding: LayoutFoodItemBinding,
    private val mealClickListener: OnMealClickListener
) :
    RecyclerView.ViewHolder(binding.root) {
    val context: Context = itemView.context

    fun bind(model: Meal) {
        binding.mealName.text = model.mealName
        binding.mealNutrition.nutritionListToText(model.mealNutrition)
        binding.mealImage.setImageResource(model.mealImage)

        binding.root.setOnClickListener {
            mealClickListener.onMealClicked(model.mealId)
        }

        setupButtonBackground(model, binding.mealAdd)

        binding.mealAdd.setOnClickListener {
            mealClickListener.onMealSelect(model.mealId)
            setupButtonBackground(model, binding.mealAdd)
        }
    }

    private fun setupButtonBackground(model: Meal, mealAdd: MaterialButton) {
        if (model.isMealSelected) {
            mealAdd.apply {
                background.setTint(ContextCompat.getColor(context, R.color.cherry_red))
                text = "Remove"
            }
        } else {
            mealAdd.apply {
                background.setTint(ContextCompat.getColor(context, R.color.green))
                text = "Add"
            }
        }
    }
}

class MenuFoodRowViewHolder(
    private val binding: LayoutFoodMenuItemBinding,
    private val mealClickListener: OnMealClickListener
) :
    RecyclerView.ViewHolder(binding.root) {
    val context: Context = itemView.context

    fun bind(model: Meal) {
        binding.mealName.text = model.mealName
        binding.apply {
            mealDescription.separateText(model.mealDescription)
            mealNutrition.nutritionListToText(model.mealNutrition)
            mealImage.setImageResource(model.mealImage)

        }
        binding.root.setOnClickListener {
            mealClickListener.onMealClicked(model.mealId)
        }
        setupButtonBackground(model, binding.mealAdd)

        binding.mealAdd.setOnClickListener {
            mealClickListener.onMealSelect(model.mealId)
            setupButtonBackground(model, binding.mealAdd)
        }
    }

    private fun setupButtonBackground(model: Meal, mealAdd: MaterialButton) {
        if (model.isMealSelected) {
            mealAdd.apply {
                background.setTint(ContextCompat.getColor(context, R.color.cherry_red))
                text = "Remove"
            }
        } else {
            mealAdd.apply {
                background.setTint(ContextCompat.getColor(context, R.color.green))
                text = "Add"
            }
        }
    }
}

interface OnMealClickListener {
    fun onMealClicked(mealId: Int)
    fun onMealSelect(mealId: Int)
}