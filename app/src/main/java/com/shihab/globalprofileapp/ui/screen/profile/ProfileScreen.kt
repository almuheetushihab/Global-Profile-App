package com.shihab.globalprofileapp.ui.screen.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.shihab.globalprofileapp.data.UserProfileManager

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Name from Singleton: ${UserProfileManager.userName.value}"
        )

        Text(
            text = "Role from Singleton: ${UserProfileManager.userRole.value}"
        )
    }
}