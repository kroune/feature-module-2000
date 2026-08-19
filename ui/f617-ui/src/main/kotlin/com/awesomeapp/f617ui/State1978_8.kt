package com.awesomeapp.f617ui

sealed class State1978_8 {
    data object Loading : State1978_8()
    data class Success(val data: String) : State1978_8()
    data class Error(val message: String) : State1978_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
