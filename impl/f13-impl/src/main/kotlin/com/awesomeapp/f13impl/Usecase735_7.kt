package com.awesomeapp.f13impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase735_7 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase735_7 UseCase")
    }
}
