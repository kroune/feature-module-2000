package com.awesomeapp.f225api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api308_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api308_6 API"
    }
}
