package com.awesomeapp.f305api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api388_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api388_6 API"
    }
}
