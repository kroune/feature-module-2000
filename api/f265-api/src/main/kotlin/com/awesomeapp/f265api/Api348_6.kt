package com.awesomeapp.f265api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api348_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api348_6 API"
    }
}
