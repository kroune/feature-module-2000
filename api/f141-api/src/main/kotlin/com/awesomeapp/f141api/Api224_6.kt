package com.awesomeapp.f141api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api224_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api224_6 API"
    }
}
