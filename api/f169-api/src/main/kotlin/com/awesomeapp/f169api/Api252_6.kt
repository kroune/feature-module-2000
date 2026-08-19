package com.awesomeapp.f169api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api252_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api252_6 API"
    }
}
