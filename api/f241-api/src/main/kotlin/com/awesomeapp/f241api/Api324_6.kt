package com.awesomeapp.f241api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api324_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api324_6 API"
    }
}
