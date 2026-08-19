package com.awesomeapp.f230impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api952_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api952_6 API"
    }
}
