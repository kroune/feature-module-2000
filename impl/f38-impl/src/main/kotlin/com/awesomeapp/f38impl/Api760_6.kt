package com.awesomeapp.f38impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api760_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api760_6 API"
    }
}
