package com.awesomeapp.f16api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase99_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase99_5 UseCase")
    }
}
