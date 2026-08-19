package com.awesomeapp.core4

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase63_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase63_5 UseCase")
    }
}
