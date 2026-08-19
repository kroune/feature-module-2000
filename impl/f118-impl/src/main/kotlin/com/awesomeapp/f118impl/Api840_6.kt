package com.awesomeapp.f118impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api840_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api840_6 API"
    }
}
