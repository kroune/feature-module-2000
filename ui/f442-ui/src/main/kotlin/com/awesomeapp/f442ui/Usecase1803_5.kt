package com.awesomeapp.f442ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1803_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1803_5 UseCase")
    }
}
