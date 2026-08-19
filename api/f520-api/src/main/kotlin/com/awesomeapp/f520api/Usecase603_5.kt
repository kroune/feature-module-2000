package com.awesomeapp.f520api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase603_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase603_5 UseCase")
    }
}
