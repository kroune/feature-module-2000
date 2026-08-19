package com.awesomeapp.f369api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api452_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api452_6 API"
    }
}
