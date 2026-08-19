package com.awesomeapp.f629api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api712_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api712_6 API"
    }
}
