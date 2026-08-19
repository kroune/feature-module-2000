package com.awesomeapp.f18impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api740_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api740_6 API"
    }
}
