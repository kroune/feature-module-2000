package com.awesomeapp.f345api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api428_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api428_6 API"
    }
}
