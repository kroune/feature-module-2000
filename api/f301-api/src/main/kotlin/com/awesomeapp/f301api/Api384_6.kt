package com.awesomeapp.f301api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api384_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api384_6 API"
    }
}
