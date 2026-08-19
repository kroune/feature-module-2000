package com.awesomeapp.f137api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api220_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api220_6 API"
    }
}
