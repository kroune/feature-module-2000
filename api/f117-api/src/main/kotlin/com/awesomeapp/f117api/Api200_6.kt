package com.awesomeapp.f117api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api200_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api200_6 API"
    }
}
