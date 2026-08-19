package com.awesomeapp.f7impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase729_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase729_5 UseCase")
    }
}
