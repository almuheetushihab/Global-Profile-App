package com.shihab.globalprofileapp.data

import androidx.compose.runtime.mutableStateOf

object UserProfileManager {
    var userName = mutableStateOf("")
    var userRole = mutableStateOf("")

    fun updateProfile(newName: String, newRole: String) {
        userName.value = newName
        userRole.value = newRole
    }
}