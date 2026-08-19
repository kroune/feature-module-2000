package com.awesomeapp.f81api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api164_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api164_6 API"
    }
}
