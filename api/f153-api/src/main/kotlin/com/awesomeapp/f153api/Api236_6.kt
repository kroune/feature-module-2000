package com.awesomeapp.f153api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api236_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api236_6 API"
    }
}
