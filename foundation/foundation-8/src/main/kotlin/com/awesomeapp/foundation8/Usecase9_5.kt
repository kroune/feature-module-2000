package com.awesomeapp.foundation8

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase9_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase9_5 UseCase")
    }
}
