package com.awesomeapp.f353impl

sealed class State1075_7 {
    data object Loading : State1075_7()
    data class Success(val data: String) : State1075_7()
    data class Error(val message: String) : State1075_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
