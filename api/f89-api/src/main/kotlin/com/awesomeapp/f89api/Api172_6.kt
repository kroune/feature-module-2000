package com.awesomeapp.f89api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api172_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api172_6 API"
    }
}
