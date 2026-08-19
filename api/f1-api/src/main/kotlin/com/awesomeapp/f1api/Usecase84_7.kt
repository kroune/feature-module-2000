package com.awesomeapp.f1api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase84_7 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase84_7 UseCase")
    }
}
