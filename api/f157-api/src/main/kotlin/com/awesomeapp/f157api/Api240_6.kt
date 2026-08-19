package com.awesomeapp.f157api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api240_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api240_6 API"
    }
}
