package com.awesomeapp.foundation31

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api32_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api32_6 API"
    }
}
