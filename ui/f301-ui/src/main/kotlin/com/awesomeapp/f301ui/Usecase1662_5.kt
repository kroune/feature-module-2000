package com.awesomeapp.f301ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1662_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1662_5 UseCase")
    }
}
