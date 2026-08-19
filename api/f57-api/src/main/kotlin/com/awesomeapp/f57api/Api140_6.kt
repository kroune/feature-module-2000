package com.awesomeapp.f57api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api140_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api140_6 API"
    }
}
