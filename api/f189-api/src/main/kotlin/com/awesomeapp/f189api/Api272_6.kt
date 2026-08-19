package com.awesomeapp.f189api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api272_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api272_6 API"
    }
}
