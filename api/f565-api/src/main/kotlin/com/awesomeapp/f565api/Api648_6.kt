package com.awesomeapp.f565api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api648_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api648_6 API"
    }
}
