package com.awesomeapp.f22ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1383_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1383_5 UseCase")
    }
}
