package com.awesomeapp.f380impl

sealed class State1102_5 {
    data object Loading : State1102_5()
    data class Success(val data: String) : State1102_5()
    data class Error(val message: String) : State1102_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
