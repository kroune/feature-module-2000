package com.awesomeapp.f288ui

sealed class State1649_5 {
    data object Loading : State1649_5()
    data class Success(val data: String) : State1649_5()
    data class Error(val message: String) : State1649_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
