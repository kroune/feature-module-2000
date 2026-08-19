package com.awesomeapp.foundation23

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase24_7 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase24_7 UseCase")
    }
}
