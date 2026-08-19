package com.awesomeapp.f281api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api364_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api364_6 API"
    }
}
