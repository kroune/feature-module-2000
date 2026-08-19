package com.awesomeapp.f285api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api368_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api368_6 API"
    }
}
