package com.awesomeapp.f529api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api612_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api612_6 API"
    }
}
