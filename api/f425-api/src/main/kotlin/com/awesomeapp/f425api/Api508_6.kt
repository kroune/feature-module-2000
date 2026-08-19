package com.awesomeapp.f425api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api508_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api508_6 API"
    }
}
