package com.awesomeapp.common16

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase51_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase51_5 UseCase")
    }
}
