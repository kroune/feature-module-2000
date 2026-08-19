package com.awesomeapp.f269api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api352_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api352_6 API"
    }
}
