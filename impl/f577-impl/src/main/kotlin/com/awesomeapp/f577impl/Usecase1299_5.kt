package com.awesomeapp.f577impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1299_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1299_5 UseCase")
    }
}
