package com.awesomeapp.f489api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api572_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api572_6 API"
    }
}
