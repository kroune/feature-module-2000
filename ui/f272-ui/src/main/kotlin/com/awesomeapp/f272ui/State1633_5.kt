package com.awesomeapp.f272ui

sealed class State1633_5 {
    data object Loading : State1633_5()
    data class Success(val data: String) : State1633_5()
    data class Error(val message: String) : State1633_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
