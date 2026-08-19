package com.awesomeapp.f125ui

sealed class State1486_5 {
    data object Loading : State1486_5()
    data class Success(val data: String) : State1486_5()
    data class Error(val message: String) : State1486_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
