package com.awesomeapp.f233api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api316_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api316_6 API"
    }
}
