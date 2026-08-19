package com.awesomeapp.f309api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api392_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api392_6 API"
    }
}
