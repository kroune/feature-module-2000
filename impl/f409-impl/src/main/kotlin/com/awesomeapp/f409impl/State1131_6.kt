package com.awesomeapp.f409impl

sealed class State1131_6 {
    data object Loading : State1131_6()
    data class Success(val data: String) : State1131_6()
    data class Error(val message: String) : State1131_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
