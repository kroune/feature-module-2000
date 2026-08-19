package com.awesomeapp.f145api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api228_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api228_6 API"
    }
}
