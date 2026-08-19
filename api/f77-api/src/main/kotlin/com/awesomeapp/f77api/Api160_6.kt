package com.awesomeapp.f77api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api160_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api160_6 API"
    }
}
