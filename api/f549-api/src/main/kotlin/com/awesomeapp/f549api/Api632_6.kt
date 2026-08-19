package com.awesomeapp.f549api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api632_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api632_6 API"
    }
}
