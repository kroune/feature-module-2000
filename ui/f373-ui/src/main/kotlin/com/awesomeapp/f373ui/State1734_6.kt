package com.awesomeapp.f373ui

sealed class State1734_6 {
    data object Loading : State1734_6()
    data class Success(val data: String) : State1734_6()
    data class Error(val message: String) : State1734_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
