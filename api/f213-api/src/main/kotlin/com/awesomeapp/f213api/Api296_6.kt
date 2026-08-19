package com.awesomeapp.f213api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api296_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api296_6 API"
    }
}
