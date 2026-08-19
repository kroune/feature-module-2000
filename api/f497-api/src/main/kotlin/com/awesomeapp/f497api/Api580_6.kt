package com.awesomeapp.f497api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api580_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api580_6 API"
    }
}
