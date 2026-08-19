package com.awesomeapp.f433api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api516_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api516_6 API"
    }
}
