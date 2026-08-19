package com.awesomeapp.f463ui

sealed class State1824_7 {
    data object Loading : State1824_7()
    data class Success(val data: String) : State1824_7()
    data class Error(val message: String) : State1824_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
