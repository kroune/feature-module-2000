package com.awesomeapp.f418api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase501_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase501_5 UseCase")
    }
}
