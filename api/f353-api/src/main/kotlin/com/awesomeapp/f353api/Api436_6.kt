package com.awesomeapp.f353api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api436_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api436_6 API"
    }
}
