package com.awesomeapp.f13ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1374_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1374_5 UseCase")
    }
}
