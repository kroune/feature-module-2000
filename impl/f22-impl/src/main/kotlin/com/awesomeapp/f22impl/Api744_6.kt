package com.awesomeapp.f22impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api744_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api744_6 API"
    }
}
