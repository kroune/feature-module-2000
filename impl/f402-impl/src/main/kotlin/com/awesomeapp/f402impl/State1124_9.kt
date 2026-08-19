package com.awesomeapp.f402impl

sealed class State1124_9 {
    data object Loading : State1124_9()
    data class Success(val data: String) : State1124_9()
    data class Error(val message: String) : State1124_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
