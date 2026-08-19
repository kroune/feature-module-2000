package com.awesomeapp.f385api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api468_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api468_6 API"
    }
}
