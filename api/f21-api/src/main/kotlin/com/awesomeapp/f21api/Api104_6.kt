package com.awesomeapp.f21api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api104_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api104_6 API"
    }
}
