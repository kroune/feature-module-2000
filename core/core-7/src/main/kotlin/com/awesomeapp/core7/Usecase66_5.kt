package com.awesomeapp.core7

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase66_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase66_5 UseCase")
    }
}
