package com.awesomeapp.f229api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api312_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api312_6 API"
    }
}
