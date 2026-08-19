package com.awesomeapp.core1

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase60_9 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase60_9 UseCase")
    }
}
