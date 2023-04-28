package com.mvukosav.studenthub.features.food

import FoodRecyclerViewAdapter
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.setPadding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.tabs.TabLayout
import com.mvukosav.studenthub.features.overview.OverviewActivity
import com.mvukosav.studenthub.R
import com.mvukosav.studenthub.databinding.FragmentFoodBinding
import com.mvukosav.studenthub.domain.models.CategoryDay
import com.mvukosav.studenthub.domain.models.Day
import com.mvukosav.studenthub.domain.models.Meal
import com.mvukosav.studenthub.utils.TimeUtil.getFoodTypeOfDay
import com.mvukosav.studenthub.utils.allergensListToText
import com.mvukosav.studenthub.utils.nutritionListToText
import com.mvukosav.studenthub.utils.separateText
import com.mvukosav.studenthub.utils.setGone
import com.mvukosav.studenthub.utils.setVisible
import com.mvukosav.studenthub.utils.setupToolbar
import com.mvukosav.studenthub.utils.toastMsg
import dagger.hilt.android.AndroidEntryPoint
import java.time.LocalDate

@AndroidEntryPoint
class FoodFragment : Fragment(), OnMealClickListener {

    private lateinit var binding: FragmentFoodBinding
    private val viewModel: FoodFragmentViewModel by viewModels()
    private lateinit var bottomSheetDialog: BottomSheetDialog
    private lateinit var foodRecyclerViewAdapter: FoodRecyclerViewAdapter
    private var selectedDate: String = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFoodBinding.inflate(inflater)
        (activity as AppCompatActivity).setupToolbar(
            binding.toolbar,
            R.color.cherry_red,
            false
        )
        binding.toolbar.txtToolbarTitle.setText(R.string.menza)
        binding.toolbar.imgToolbarIcon.setImageResource(R.drawable.food_ic)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bottomSheetDialog = BottomSheetDialog(requireContext())
        setInitialTabLayoutIndicators()
        initRecyclerViews()
        createClickListeners()
        observeFood()
        observeMealById()
        observeError()
        observeSelectedDate()
        observeNumberOfSelectedMeals()
    }

    override fun onPause() {
        super.onPause()
        bottomSheetDialog.hide()
    }

    override fun onResume() {
        super.onResume()
        viewModel.onMealSelect(-1)
        viewModel.fetchDailyFood()
    }

    private fun initRecyclerViews() {
        binding.dailyFoodContainer.recyclerViewDailyFood.apply {
            layoutManager = LinearLayoutManager(context)
            foodRecyclerViewAdapter = FoodRecyclerViewAdapter(requireContext(), this@FoodFragment)
            adapter = foodRecyclerViewAdapter
        }
    }

    private fun createClickListeners() {
        binding.btnOverview.setOnClickListener {
            val intent = Intent(requireContext(), OverviewActivity::class.java)
            intent.putExtra("SELECTED_DATE", selectedDate)
            registerForActivityResult.launch(intent)
        }

        binding.foodTypeOfDayTabLayout.root.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let {
                    val tabText = it.text.toString().uppercase()
                    viewModel.onDayCategorySelected(CategoryDay.valueOf(tabText))
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })

        binding.dayTabLayout.root.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let {
                    val tabText = it.text.toString().uppercase()
                    Day.values().find { it.dayName == tabText }
                        ?.let { day -> viewModel.onDaySelected(day) }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Sometimes it have the wrong one selected when changing day.
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }

    private fun observeFood() {
        viewModel.fetchDailyFoodLiveData.observe(viewLifecycleOwner) {
            if (it != null) {
                //show food
                Log.d("FOOD", it.toString())
                foodRecyclerViewAdapter.swapList(it.food)
            } else {
                Log.d("FOOD_NO", it.toString())
            }
        }
    }

    private fun observeSelectedDate() {
        viewModel.fetchSelectedDateLiveData.observe(viewLifecycleOwner) {
            if (it.isNotEmpty()) selectedDate = it
        }
    }

    private fun observeError() {
        viewModel.fetchErrorLiveData.observe(viewLifecycleOwner) {
            if (it != null) {
                toastMsg(requireContext(), it)
            }
        }
    }

    private fun observeMealById() {
        viewModel.fetchMealByIdLiveData.observe(viewLifecycleOwner) {
            if (it != null) {
                // Show dialog
                showFoodDetailBottomSheet(it)
            } else {
                toastMsg(requireContext(), "Unknown error")
            }
        }
    }

    private fun observeNumberOfSelectedMeals() {
        viewModel.fetchNumberOfSelectedMealsLiveData.observe(viewLifecycleOwner) {
            if (it != 0) {
                // Show btn
                binding.btnOverview.setVisible()
                binding.dailyFoodContainer.root.setPadding(ZERO, ZERO, ZERO, PADDING_BOTTOM)
            } else {
                // hide btn
                binding.btnOverview.setGone()
                binding.dailyFoodContainer.root.setPadding(ZERO)
            }
        }
    }

//    private fun observeDayAndTypeOfDay() {
//        viewModel.fetchSelectedDateLiveData.observe(viewLifecycleOwner) {
//            val day = it[0]
//            val typeOfDay = CategoryDay.valueOf(it[1].name)
//            val typeOfDayTabLayout = binding.foodTypeOfDayTabLayout.root
//            val dayTabLayout = binding.dayTabLayout.root
//
//            for (i in 0 until dayTabLayout.tabCount) {
//                val tab = dayTabLayout.getTabAt(i)
//                if (tab?.text == Day.valueOf(day.name).dayName) {
//                    dayTabLayout.selectTab(tab)
//                    dayTabLayout.post {
//                        tab.select()
//                        val tabView = tab.view
//                        val x = (tabView.width - tabView.paddingLeft - tabView.paddingRight) / 2
//                        dayTabLayout.smoothScrollTo(x, 0)
//                    }
//                    break
//                }
//            }
//
//            for (i in 0 until typeOfDayTabLayout.tabCount) {
//                val tab = typeOfDayTabLayout.getTabAt(i)
//                if (tab?.text == typeOfDay.title) {
//                    tab.select()
//                    break
//                }
//            }
//        }
//    }

    private fun setInitialTabLayoutIndicators() {
        val typeOfDay = getFoodTypeOfDay()
        val typeOfDayTabLayout = binding.foodTypeOfDayTabLayout.root

        val day = LocalDate.now().dayOfWeek
        val dayTabLayout = binding.dayTabLayout.root

        for (i in 0 until dayTabLayout.tabCount) {
            val tab = dayTabLayout.getTabAt(i)
            if (tab?.text == Day.valueOf(day.name).dayName) {
                dayTabLayout.selectTab(tab)
                dayTabLayout.post {
                    tab.select()
                    val tabView = tab.view
                    val x = (tabView.width - tabView.paddingLeft - tabView.paddingRight) / 2
                    dayTabLayout.smoothScrollTo(x, 0)
                }
                break
            }
        }

        for (i in 0 until typeOfDayTabLayout.tabCount) {
            val tab = typeOfDayTabLayout.getTabAt(i)
            if (tab?.text == typeOfDay.title) {
                tab.select()
                break
            }
        }
    }

    private fun showFoodDetailBottomSheet(meal: Meal) {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.layout_bottom_sheet_meal_details, binding.root, false)
        bottomSheetDialog.setContentView(view)

        val imageView = view.findViewById<ImageView>(R.id.meal_image)

        val txtMealName = view.findViewById<TextView>(R.id.meal_name)
        val txtMealDescription = view.findViewById<TextView>(R.id.meal_description)
        val txtWeight = view.findViewById<TextView>(R.id.meal_weight)
        val txtNutrition = view.findViewById<TextView>(R.id.meal_nutrition)
        val txtAllergens = view.findViewById<TextView>(R.id.meal_allergens)

        imageView.setImageResource(meal.mealImage)
        txtMealName.text = meal.mealName
        if (!meal.mealName.contains("Menu")) {
            txtMealDescription.setGone()
        } else txtMealDescription.separateText(meal.mealDescription)

        txtWeight.text = "Weight: " + meal.mealWeight.toString() + "g"
        if (meal.mealNutrition.isEmpty()) txtNutrition.setGone()
        txtNutrition.nutritionListToText(meal.mealNutrition)
        if (meal.mealAllergens.isEmpty()) txtAllergens.setGone()
        txtAllergens.allergensListToText(meal.mealAllergens)
        bottomSheetDialog.show()
    }

    private val registerForActivityResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == MEAL_REMOVED) {
//                viewModel.onMealSelect(-1)
//                viewModel.fetchDailyFood()
            }
        }


// interfaces click Listeners

    override fun onMealClicked(mealId: Int) {
        viewModel.getMealById(mealId)
    }

    override fun onMealSelect(mealId: Int) {
        viewModel.onMealSelect(mealId)
    }

    companion object {
        private const val ZERO = 0
        private const val PADDING_BOTTOM = 120
        const val MEAL_REMOVED = 12441
    }
}
