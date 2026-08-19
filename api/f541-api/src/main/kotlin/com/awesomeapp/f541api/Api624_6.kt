package com.awesomeapp.f541api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api624_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api624_6 API"
    }
}
