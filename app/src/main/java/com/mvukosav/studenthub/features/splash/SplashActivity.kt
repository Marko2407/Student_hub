package com.mvukosav.studenthub.features.splash

import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.mvukosav.studenthub.R
import com.mvukosav.studenthub.databinding.ActivitySplashBinding
import com.mvukosav.studenthub.features.MainActivity
import com.mvukosav.studenthub.utils.observeOnMainThread
import com.mvukosav.studenthub.utils.setGone
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    private val viewModel: SplashViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        lifecycleScope.launchWhenCreated {
            delay(DELAY_MILLIS)
            viewModel.userLogin()
            openMainScreen()
        }


//        observeOnMainThread(viewModel.fetchUserLiveData){
//            if (it != null){
//                openMainScreen()
//                Log.d("SUCCESS", it.toString())
//            }else{
//                openLoginScreen()
//                Log.d("FAILED", it.toString())
//            }
//        }
    }

    private fun openMainScreen() {
        startActivity(MainActivity.createIntent(this))
       // overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        finishAfterTransition()
    }

    private fun openLoginScreen() {
//        startActivity(LoginActivity.createIntent(this))
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        finish()
    }

    companion object {
        private const val DELAY_MILLIS: Long = 700
        fun createIntent(context: Context) = Intent(context, SplashActivity::class.java)
    }
}