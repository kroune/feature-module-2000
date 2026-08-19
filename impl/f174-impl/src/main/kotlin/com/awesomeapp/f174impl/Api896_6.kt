package com.awesomeapp.f174impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api896_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api896_6 API"
    }
}
