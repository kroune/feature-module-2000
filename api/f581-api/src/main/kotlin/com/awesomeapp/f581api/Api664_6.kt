package com.awesomeapp.f581api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api664_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api664_6 API"
    }
}
