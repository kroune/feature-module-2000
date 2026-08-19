package com.awesomeapp.f499impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1221_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1221_5 UseCase")
    }
}
