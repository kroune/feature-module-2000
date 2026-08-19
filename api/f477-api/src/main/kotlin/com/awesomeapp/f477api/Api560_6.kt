package com.awesomeapp.f477api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api560_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api560_6 API"
    }
}
