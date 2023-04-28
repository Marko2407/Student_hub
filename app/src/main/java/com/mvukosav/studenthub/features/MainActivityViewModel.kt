package com.mvukosav.studenthub.features

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mvukosav.studenthub.domain.models.User
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
//    private val logoutUser: LogoutUser,
//    private val getCurrentUser: GetUser
) : ViewModel() {
    val userLiveData: MutableLiveData<User?> by lazy {
        MutableLiveData<User?>()
    }
//
//    fun fetchUserData() {
//        userLiveData.value = getCurrentUser()
//    }
//
//    fun signOutUser() {
//        if (logoutUser()) {
//            userLiveData.value = null
//        }
//    }
}