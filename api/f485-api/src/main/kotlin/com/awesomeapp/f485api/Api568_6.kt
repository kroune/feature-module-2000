package com.awesomeapp.f485api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api568_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api568_6 API"
    }
}
