package com.awesomeapp.f14ui

sealed class State1375_10 {
    data object Loading : State1375_10()
    data class Success(val data: String) : State1375_10()
    data class Error(val message: String) : State1375_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
