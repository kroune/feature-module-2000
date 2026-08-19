package com.awesomeapp.f400impl

sealed class State1122_6 {
    data object Loading : State1122_6()
    data class Success(val data: String) : State1122_6()
    data class Error(val message: String) : State1122_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
