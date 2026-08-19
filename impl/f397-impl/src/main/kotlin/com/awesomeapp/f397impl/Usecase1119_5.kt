package com.awesomeapp.f397impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1119_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1119_5 UseCase")
    }
}
