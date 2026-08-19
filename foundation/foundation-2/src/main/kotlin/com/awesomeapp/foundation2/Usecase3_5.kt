package com.awesomeapp.foundation2

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase3_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase3_5 UseCase")
    }
}
