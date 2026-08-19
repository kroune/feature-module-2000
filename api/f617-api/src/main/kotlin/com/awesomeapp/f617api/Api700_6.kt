package com.awesomeapp.f617api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api700_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api700_6 API"
    }
}
