package com.awesomeapp.f165api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api248_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api248_6 API"
    }
}
