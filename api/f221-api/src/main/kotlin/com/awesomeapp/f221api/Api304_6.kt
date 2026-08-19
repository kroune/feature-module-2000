package com.awesomeapp.f221api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api304_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api304_6 API"
    }
}
