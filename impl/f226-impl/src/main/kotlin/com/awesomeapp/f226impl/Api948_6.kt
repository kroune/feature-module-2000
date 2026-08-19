package com.awesomeapp.f226impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api948_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api948_6 API"
    }
}
