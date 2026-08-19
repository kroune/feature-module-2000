package com.awesomeapp.f91api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase174_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase174_5 UseCase")
    }
}
