package com.mvukosav.studenthub.features

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.core.view.GravityCompat
import androidx.core.view.get
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.mvukosav.studenthub.R
import com.mvukosav.studenthub.databinding.ActivityMainBinding
import com.mvukosav.studenthub.domain.models.User
import com.mvukosav.studenthub.features.food.FoodFragment
import com.mvukosav.studenthub.features.home.HomeFragment
import com.mvukosav.studenthub.features.settings.SettingsActivity
import com.mvukosav.studenthub.features.splash.SplashActivity
import com.mvukosav.studenthub.features.weeklyoverview.WeeklyOverviewActivity
import com.mvukosav.studenthub.features.weeklyoverview.WeeklyOverviewViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout
    private val viewModel: MainActivityViewModel by viewModels()
    private var currentFragment: Int = HOME_FRAGMENT
    private var drawerOpen: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        drawerLayout = binding.mainContainer
        drawerLayout.drawerElevation = 16F
        fetchUser()
        setupBottomNavigationBar()
        createSideNavigationBar()
        setOnClickListeners()
        drawerListener()
    }


    private fun fetchUser() {
//        viewModel.fetchUserData()
        viewModel.userLiveData.observe(this) { user ->
            if (user != null) {
                setUserSideDrawer(user)
            } else {
                //go to splash screen
                openSplashScreen()
            }
        }
    }

    private fun setupBottomNavigationBar() {
        val bottomNavigationBar = binding.bottomNavigationView
        setCurrentFragment(HomeFragment())
        bottomNavigationBar.menu.getItem(HOME_FRAGMENT).isChecked = true
        bottomNavigationBar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    sideMenuOptionsVisibility(false)
                    setCurrentFragment(HomeFragment())
                    it.isChecked = true
                    currentFragment = HOME_FRAGMENT
                    return@setOnItemSelectedListener true
                }
                R.id.food -> {
                    sideMenuOptionsVisibility(true)
                    setCurrentFragment(FoodFragment())
                    it.isChecked = true
                    currentFragment = FOOD_FRAGMENT
                    return@setOnItemSelectedListener true
                }
                R.id.userProfile -> {
                    drawerLayout.openDrawer(GravityCompat.START)
                    return@setOnItemSelectedListener true
                }
                else -> false
            }
        }
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragment)
            commit()
        }
    }


    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
            binding.bottomNavigationView.menu.getItem(currentFragment).isChecked = true
        } else {
            super.onBackPressed()
        }
    }

    private fun setOnClickListeners() {}


    private fun drawerListener() {
        drawerLayout.addDrawerListener(object : DrawerLayout.DrawerListener {
            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
                if (drawerOpen) {
                    binding.bottomNavigationView.menu.getItem(currentFragment).isChecked = true
                    drawerOpen = false
                }
            }

            override fun onDrawerOpened(drawerView: View) {
                drawerOpen = true
            }

            override fun onDrawerStateChanged(newState: Int) {}
            override fun onDrawerClosed(drawerView: View) {
                drawerOpen = false
            }
        })
    }

    private fun setUserSideDrawer(user: User) {
        val headerView = binding.navView.getHeaderView(0)
        val navUserName: TextView = headerView.findViewById(R.id.txt_user_name)
        val navUserEmail: TextView = headerView.findViewById(R.id.txt_user_email)
        val navUserInitials: TextView = headerView.findViewById(R.id.user_initials)
        navUserName.text = user.fullName
        navUserEmail.text = user.email
        navUserInitials.text = user.userInitials
    }

    fun logout() {
//        viewModel.signOutUser()
    }

    private fun createSideNavigationBar() {
        val sideNavigationBar = binding.navView
        sideNavigationBar.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.history -> {
                    startActivity(WeeklyOverviewActivity.createIntent(this))
                    drawerLayout.close()
                    return@setNavigationItemSelectedListener true
                }
                else -> false
            }
        }
    }

    private fun sideMenuOptionsVisibility(isVisible: Boolean) {
        binding.navView.menu[0].isVisible = isVisible
    }


    private fun openSplashScreen() {
        startActivity(SplashActivity.createIntent(this))
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        finish()
    }

    companion object {
        fun createIntent(context: Context) = Intent(context, MainActivity::class.java)
        private const val HOME_FRAGMENT = 2
        private const val FOOD_FRAGMENT = 1
    }
}