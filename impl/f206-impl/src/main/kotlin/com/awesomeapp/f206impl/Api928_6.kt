package com.awesomeapp.f206impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api928_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api928_6 API"
    }
}
