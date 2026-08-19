package com.awesomeapp.f454impl

sealed class State1176_7 {
    data object Loading : State1176_7()
    data class Success(val data: String) : State1176_7()
    data class Error(val message: String) : State1176_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
