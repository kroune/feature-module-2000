package com.awesomeapp.f573api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api656_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api656_6 API"
    }
}
