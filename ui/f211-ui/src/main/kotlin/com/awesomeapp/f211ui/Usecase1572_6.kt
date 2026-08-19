package com.awesomeapp.f211ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1572_6 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1572_6 UseCase")
    }
}
