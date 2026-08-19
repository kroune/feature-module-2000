package com.awesomeapp.f16ui

sealed class State1377_9 {
    data object Loading : State1377_9()
    data class Success(val data: String) : State1377_9()
    data class Error(val message: String) : State1377_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
