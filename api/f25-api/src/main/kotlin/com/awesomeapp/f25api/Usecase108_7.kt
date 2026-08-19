package com.awesomeapp.f25api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase108_7 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase108_7 UseCase")
    }
}
