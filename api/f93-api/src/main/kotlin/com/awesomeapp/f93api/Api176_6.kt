package com.awesomeapp.f93api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api176_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api176_6 API"
    }
}
