package com.awesomeapp.f445api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api528_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api528_6 API"
    }
}
