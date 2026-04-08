# Global Profile App 📱

A simple Android application built with **Jetpack Compose** to demonstrate **Global State Management** using the **Singleton Pattern**.

## 🚀 Purpose of this Project
The main goal of this project is to practice and demonstrate how to share data between different screens without using complex dependency injection or manual intent passing. It focuses on:
- Implementing the **Singleton Pattern** in Kotlin.
- Managing global state using `mutableStateOf`.
- Navigating between screens while maintaining data integrity.

## ✨ Features
- **Profile Input:** Users can enter their Name and Role.
- **Global Saving:** Data is saved to a central Singleton object (`UserProfileManager`).
- **Data Display:** A separate profile screen reads and displays the saved data in real-time.
- **Reactive UI:** The UI automatically updates whenever the global state changes.

## 🛠️ Technical Stack
- **Language:** Kotlin
- **UI Framework:** Jetpack Compose
- **Navigation:** Compose Navigation
- **Architecture Pattern:** Singleton Pattern for State Management

## 📖 How it Works

### 1. The Singleton (`UserProfileManager`)
The core of the app is the `UserProfileManager` object. By using Kotlin's `object` keyword, we ensure there is only one instance of this data holder throughout the app's lifecycle.
```kotlin
object UserProfileManager {
    var userName = mutableStateOf("")
    var userRole = mutableStateOf("")
    // Methods to update and clear data...
}
```

### 2. State Reactivity
We use `mutableStateOf` inside the Singleton. This makes the data "observable" by Compose. When `InputScreen` updates the value, `ProfileScreen` automatically re-renders (recomposes) to show the new information.

### 3. Navigation
The app uses a `NavHost` to manage two main routes:
- `input`: Where the user provides data.
- `profile`: Where the global data is displayed.

## 📂 Project Structure
- `ui.screen.input`: Contains the logic for the data entry screen.
- `ui.screen.profile`: Contains the logic for displaying the saved profile.
- `data`: Holds the `UserProfileManager` Singleton.
- `MainActivity`: Orchestrates the navigation and theme.

## 💡 Learning Outcomes
- Understanding the lifecycle of a Singleton in Android.
- Implementing one-way data flow (Input -> Singleton -> Display).
- Managing UI states effectively using Compose's reactive nature.

---
*Created as a practice project for mastering State Management in modern Android development.*
*Develop By Shihab*
