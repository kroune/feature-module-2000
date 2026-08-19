package com.awesomeapp.f569api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api652_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api652_6 API"
    }
}
