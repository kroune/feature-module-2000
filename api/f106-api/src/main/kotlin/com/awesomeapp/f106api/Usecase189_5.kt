package com.awesomeapp.f106api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase189_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase189_5 UseCase")
    }
}
