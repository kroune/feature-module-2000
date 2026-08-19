package com.awesomeapp.f481api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api564_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api564_6 API"
    }
}
