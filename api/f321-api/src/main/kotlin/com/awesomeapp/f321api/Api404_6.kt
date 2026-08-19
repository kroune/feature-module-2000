package com.awesomeapp.f321api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api404_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api404_6 API"
    }
}
