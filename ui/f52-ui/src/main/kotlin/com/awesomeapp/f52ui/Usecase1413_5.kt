package com.awesomeapp.f52ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1413_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1413_5 UseCase")
    }
}
