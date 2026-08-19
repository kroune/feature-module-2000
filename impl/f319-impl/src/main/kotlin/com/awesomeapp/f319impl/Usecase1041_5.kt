package com.awesomeapp.f319impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1041_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1041_5 UseCase")
    }
}
