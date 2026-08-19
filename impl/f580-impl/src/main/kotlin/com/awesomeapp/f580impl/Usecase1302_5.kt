package com.awesomeapp.f580impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1302_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1302_5 UseCase")
    }
}
