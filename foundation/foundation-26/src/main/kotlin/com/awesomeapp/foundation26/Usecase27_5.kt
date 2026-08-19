package com.awesomeapp.foundation26

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase27_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase27_5 UseCase")
    }
}
