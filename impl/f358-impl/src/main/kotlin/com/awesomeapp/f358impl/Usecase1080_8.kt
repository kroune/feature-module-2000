package com.awesomeapp.f358impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1080_8 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1080_8 UseCase")
    }
}
