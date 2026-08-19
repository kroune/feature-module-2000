package com.awesomeapp.f31api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase114_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase114_5 UseCase")
    }
}
