package com.awesomeapp.core22

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase81_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase81_5 UseCase")
    }
}
