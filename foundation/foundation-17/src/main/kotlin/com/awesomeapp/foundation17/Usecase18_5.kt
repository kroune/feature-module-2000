package com.awesomeapp.foundation17

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase18_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase18_5 UseCase")
    }
}
