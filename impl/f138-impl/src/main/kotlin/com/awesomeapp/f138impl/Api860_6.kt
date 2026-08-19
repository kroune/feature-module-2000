package com.awesomeapp.f138impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api860_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api860_6 API"
    }
}
