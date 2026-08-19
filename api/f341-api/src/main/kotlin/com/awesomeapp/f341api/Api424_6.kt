package com.awesomeapp.f341api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api424_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api424_6 API"
    }
}
