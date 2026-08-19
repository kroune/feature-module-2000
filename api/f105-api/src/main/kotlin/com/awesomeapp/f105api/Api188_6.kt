package com.awesomeapp.f105api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api188_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api188_6 API"
    }
}
