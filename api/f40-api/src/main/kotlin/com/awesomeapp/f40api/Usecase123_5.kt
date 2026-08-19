package com.awesomeapp.f40api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase123_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase123_5 UseCase")
    }
}
