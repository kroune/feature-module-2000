package com.awesomeapp.f385impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1107_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1107_5 UseCase")
    }
}
