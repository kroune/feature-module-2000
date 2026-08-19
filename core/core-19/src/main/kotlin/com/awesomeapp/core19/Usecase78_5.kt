package com.awesomeapp.core19

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase78_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase78_5 UseCase")
    }
}
