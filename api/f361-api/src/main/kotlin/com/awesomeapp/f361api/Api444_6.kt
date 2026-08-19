package com.awesomeapp.f361api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api444_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api444_6 API"
    }
}
