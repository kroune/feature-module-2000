package com.awesomeapp.f41api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api124_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api124_6 API"
    }
}
