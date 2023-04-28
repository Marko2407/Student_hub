package com.mvukosav.studenthub.features.weeklyoverview

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import com.mvukosav.studenthub.R
import com.mvukosav.studenthub.databinding.ActivityWeeklyOverviewBinding
import com.mvukosav.studenthub.domain.models.Day
import com.mvukosav.studenthub.features.overview.OverviewActivity
import com.mvukosav.studenthub.utils.setGone
import com.mvukosav.studenthub.utils.setVisible
import com.mvukosav.studenthub.utils.setupToolbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WeeklyOverviewActivity : AppCompatActivity(), OnWeeklyOverviewDayClickListener {
    private lateinit var binding: ActivityWeeklyOverviewBinding
    private val viewModel: WeeklyOverviewViewModel by viewModels()
    private lateinit var weeklyOverviewRecyclerViewAdapter: WeeklyOverviewRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeeklyOverviewBinding.inflate(layoutInflater)
        setupToolbar(binding.toolbar, R.color.cherry_red)
        binding.toolbar.txtToolbarTitle.text = getString(R.string.weekly_overview)
        setContentView(binding.root)
        initRecyclerViews()
        setOnClickListener()
        observeSelectedMeals()
    }

    override fun onResume() {
        super.onResume()
        viewModel.fetchSelectedFood()
    }

    private fun setOnClickListener() {}

    private fun initRecyclerViews() {
        binding.recyclerViewWeeklyOverview.apply {
            layoutManager = LinearLayoutManager(context)
            weeklyOverviewRecyclerViewAdapter =
                WeeklyOverviewRecyclerViewAdapter(context, this@WeeklyOverviewActivity)
            adapter = weeklyOverviewRecyclerViewAdapter
        }
    }

    private fun observeSelectedMeals() {
        viewModel.fetchSelectedWeeklyFoodLiveData.observe(this) {
            if (!it.isNullOrEmpty()) {
                weeklyOverviewRecyclerViewAdapter.swapList(it)
                binding.noDataView.root.setGone()
                binding.recyclerViewWeeklyOverview.setVisible()
            } else {
                binding.recyclerViewWeeklyOverview.setGone()
                binding.noDataView.root.setVisible()
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

    companion object {
        fun createIntent(context: Context) = Intent(context, WeeklyOverviewActivity::class.java)
    }

    override fun onDayClicked(date: String) {
        val intent = Intent(this, OverviewActivity::class.java)
        intent.putExtra("SELECTED_DATE", date)
        startActivity(intent)
    }
}