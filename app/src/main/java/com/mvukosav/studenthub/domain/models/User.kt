package com.mvukosav.studenthub.domain.models

data class User(
    val userId: String = "",
    val email: String?,
    val fullName: String? = "",
    var userInitials: String? = ""
) {
    init {
        createUserInitials()
    }

    private fun createUserInitials() {
        if (fullName != null) {
            val userName = fullName.split(" ")
            val firstLetter = userName.first().first().toString()
            val secondLetter = userName.last().first().toString()
            userInitials = (firstLetter + secondLetter).uppercase()
        }
    }
}
