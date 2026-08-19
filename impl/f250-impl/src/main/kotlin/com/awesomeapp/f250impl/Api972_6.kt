package com.awesomeapp.f250impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api972_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api972_6 API"
    }
}
