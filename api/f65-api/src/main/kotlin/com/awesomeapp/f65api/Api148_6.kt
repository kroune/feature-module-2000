package com.awesomeapp.f65api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api148_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api148_6 API"
    }
}
