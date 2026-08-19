package com.awesomeapp.f126impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api848_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api848_6 API"
    }
}
