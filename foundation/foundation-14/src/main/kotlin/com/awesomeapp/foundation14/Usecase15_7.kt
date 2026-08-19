package com.awesomeapp.foundation14

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase15_7 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase15_7 UseCase")
    }
}
