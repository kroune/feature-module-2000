package com.awesomeapp.f182impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api904_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api904_6 API"
    }
}
