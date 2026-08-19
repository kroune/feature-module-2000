package com.awesomeapp.f278impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api1000_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api1000_6 API"
    }
}
