package com.awesomeapp.f317api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api400_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api400_6 API"
    }
}
