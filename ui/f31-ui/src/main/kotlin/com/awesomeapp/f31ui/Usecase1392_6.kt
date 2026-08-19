package com.awesomeapp.f31ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1392_6 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1392_6 UseCase")
    }
}
