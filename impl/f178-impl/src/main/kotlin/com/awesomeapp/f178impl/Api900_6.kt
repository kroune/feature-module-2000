package com.awesomeapp.f178impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api900_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api900_6 API"
    }
}
