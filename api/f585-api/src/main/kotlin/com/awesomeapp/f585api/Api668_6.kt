package com.awesomeapp.f585api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api668_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api668_6 API"
    }
}
