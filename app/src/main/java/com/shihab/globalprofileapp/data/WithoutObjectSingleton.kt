package com.shihab.globalprofileapp.data

class UserManager private constructor() {
    companion object {
        @Volatile
        private var instance: UserManager? = null

        fun getInstance(): UserManager {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = UserManager()
                    }
                }
            }
            return instance!!
        }
    }

    var userName: String = ""
    var userRole: String = ""
}
