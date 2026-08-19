package com.awesomeapp.foundation32

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase33_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase33_5 UseCase")
    }
}
