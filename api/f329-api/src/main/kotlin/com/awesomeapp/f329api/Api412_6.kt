package com.awesomeapp.f329api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api412_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api412_6 API"
    }
}
