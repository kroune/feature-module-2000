package com.awesomeapp.f240ui

sealed class State1601_5 {
    data object Loading : State1601_5()
    data class Success(val data: String) : State1601_5()
    data class Error(val message: String) : State1601_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
