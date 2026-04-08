package com.shihab.globalprofileapp.ui.screen.input

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shihab.globalprofileapp.data.UserProfileManager

@Composable
fun InputScreen(onNavigate: () -> Unit) {
    var nameInput by remember { mutableStateOf("") }
    var roleInput by remember { mutableStateOf("") }

    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = nameInput,
            onValueChange = { nameInput = it },
            label = { Text("Enter Name") },
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = roleInput,
            onValueChange = { roleInput = it },
            label = { Text("Enter Role") },
        )

        Button(onClick = {
            UserProfileManager.updateProfile(
                nameInput,
                roleInput,
            )
            onNavigate()
        },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Save to Singleton & Next")
        }
    }
}

@Preview
@Composable
fun InputScreenPreview() {
    InputScreen(onNavigate = {})
}
