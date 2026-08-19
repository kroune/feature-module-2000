package com.awesomeapp.f74impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api796_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api796_6 API"
    }
}
