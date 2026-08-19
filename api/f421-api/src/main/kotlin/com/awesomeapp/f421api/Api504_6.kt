package com.awesomeapp.f421api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api504_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api504_6 API"
    }
}
