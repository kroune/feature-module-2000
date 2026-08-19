package com.awesomeapp.f9api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api92_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api92_6 API"
    }
}
