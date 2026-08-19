package com.awesomeapp.f4api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase87_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase87_5 UseCase")
    }
}
