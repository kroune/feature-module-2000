package com.awesomeapp.f201api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api284_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api284_6 API"
    }
}
