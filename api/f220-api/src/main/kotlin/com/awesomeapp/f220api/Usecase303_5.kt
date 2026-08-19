package com.awesomeapp.f220api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase303_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase303_5 UseCase")
    }
}
