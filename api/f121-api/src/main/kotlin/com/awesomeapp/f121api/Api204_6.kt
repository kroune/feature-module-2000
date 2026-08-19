package com.awesomeapp.f121api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api204_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api204_6 API"
    }
}
