package com.awesomeapp.f266impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api988_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api988_6 API"
    }
}
