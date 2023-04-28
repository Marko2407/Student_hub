package com.mvukosav.studenthub.features.overview

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mvukosav.studenthub.R
import com.mvukosav.studenthub.databinding.ActivityOverviewBinding
import com.mvukosav.studenthub.features.food.FoodFragment.Companion.MEAL_REMOVED
import com.mvukosav.studenthub.utils.nutritionListToText
import com.mvukosav.studenthub.utils.setGone
import com.mvukosav.studenthub.utils.setVisible
import com.mvukosav.studenthub.utils.setupToolbar
import com.mvukosav.studenthub.utils.toastMsg
import com.mvukosav.studenthub.utils.totalNutritionListToText
import dagger.hilt.android.AndroidEntryPoint
import java.time.LocalDate

@AndroidEntryPoint
class OverviewActivity : AppCompatActivity(), OnOverviewMealClickListener {
    private lateinit var binding: ActivityOverviewBinding
    private val viewModel: OverviewViewModel by viewModels()
    private lateinit var overviewRecyclerViewAdapter: OverviewRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = intent // Get the Intent that started this activity
        val selectedDate = intent.getStringExtra("SELECTED_DATE") ?: LocalDate.now()
            .toString()// Fetch the string value of "EXTRA_MESSAGE" from the Intent

        binding = ActivityOverviewBinding.inflate(layoutInflater)
        setupToolbar(binding.toolbar, R.color.cherry_red)
        binding.toolbar.txtToolbarTitle.text = getString(R.string.overview)
        setContentView(binding.root)
        initRecyclerViews()
        setNutritionText()
        setOnClickListener()
        observeSelectedMeals()
        observeTotalFoodNutrition()
        viewModel.fetchSelectedFood(selectedDate)
    }

    private fun setOnClickListener() {}

    private fun initRecyclerViews() {
        binding.recyclerViewOverview.apply {
            layoutManager = LinearLayoutManager(context)
            overviewRecyclerViewAdapter =
                OverviewRecyclerViewAdapter(context, this@OverviewActivity)
            adapter = overviewRecyclerViewAdapter
        }
    }

    private fun observeSelectedMeals() {
        viewModel.fetchSelectedFoodLiveData.observe(this) {
            if (!it.isNullOrEmpty()) {
                overviewRecyclerViewAdapter.swapList(it)
                binding.apply {
                    recyclerViewOverview.setVisible()
                    noDataView.root.setGone()
                }
            } else {
                binding.apply {
                    recyclerViewOverview.setGone()
                    noDataView.root.setVisible()
                }
            }
        }
    }

    private fun observeTotalFoodNutrition() {
        viewModel.fetchTotalFoodNutritionLiveData.observe(this) {
            if (!it.isNullOrEmpty()) {
                binding.overviewTotalView.content.totalNutritionListToText(it)
            } else {
                setNutritionText()
            }

        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean =
        if (item.itemId == android.R.id.home) {
            finish()
            true
        } else {
            super.onOptionsItemSelected(item)
        }

    private fun setNutritionText(
        calories: Int = 0,
        proteins: Int = 0,
        salt: Int = 0,
    ) {
        binding.overviewTotalView.content.text =
            getString(
                R.string.calories_s1kcal_nproteins_s2g_nfat_s3g_nsugar_s4g,
                calories,
                proteins,
                salt
            )
    }

    companion object {
        fun createIntent(context: Context) = Intent(context, OverviewActivity::class.java)
    }

    override fun onMealClicked(mealId: Int, number: Int) {
        viewModel.onMealUpdate(mealId, number)
        setResult(MEAL_REMOVED, intent)
    }
}