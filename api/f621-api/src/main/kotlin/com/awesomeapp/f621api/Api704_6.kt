package com.awesomeapp.f621api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api704_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api704_6 API"
    }
}
