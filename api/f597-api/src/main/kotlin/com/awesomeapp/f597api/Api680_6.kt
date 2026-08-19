package com.awesomeapp.f597api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api680_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api680_6 API"
    }
}
