package com.awesomeapp.f524ui

sealed class State1885_10 {
    data object Loading : State1885_10()
    data class Success(val data: String) : State1885_10()
    data class Error(val message: String) : State1885_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
