package com.awesomeapp.core13

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase72_7 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase72_7 UseCase")
    }
}
