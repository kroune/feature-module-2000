package com.awesomeapp.f161api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api244_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api244_6 API"
    }
}
