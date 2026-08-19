package com.awesomeapp.f637api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api720_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api720_6 API"
    }
}
