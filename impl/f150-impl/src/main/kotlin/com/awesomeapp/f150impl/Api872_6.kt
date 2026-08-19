package com.awesomeapp.f150impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api872_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api872_6 API"
    }
}
