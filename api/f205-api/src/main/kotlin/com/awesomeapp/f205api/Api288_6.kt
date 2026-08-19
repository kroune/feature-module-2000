package com.awesomeapp.f205api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api288_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api288_6 API"
    }
}
