package com.awesomeapp.f392ui

sealed class State1753_5 {
    data object Loading : State1753_5()
    data class Success(val data: String) : State1753_5()
    data class Error(val message: String) : State1753_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
