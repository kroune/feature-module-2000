package com.awesomeapp.f333api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api416_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api416_6 API"
    }
}
