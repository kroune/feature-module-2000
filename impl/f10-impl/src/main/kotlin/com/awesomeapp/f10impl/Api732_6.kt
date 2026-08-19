package com.awesomeapp.f10impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api732_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api732_6 API"
    }
}
