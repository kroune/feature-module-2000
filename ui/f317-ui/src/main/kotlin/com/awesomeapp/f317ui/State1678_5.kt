package com.awesomeapp.f317ui

sealed class State1678_5 {
    data object Loading : State1678_5()
    data class Success(val data: String) : State1678_5()
    data class Error(val message: String) : State1678_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
