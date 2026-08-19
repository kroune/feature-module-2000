package com.awesomeapp.f61api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api144_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api144_6 API"
    }
}
