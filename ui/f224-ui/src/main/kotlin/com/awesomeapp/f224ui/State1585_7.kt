package com.awesomeapp.f224ui

sealed class State1585_7 {
    data object Loading : State1585_7()
    data class Success(val data: String) : State1585_7()
    data class Error(val message: String) : State1585_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
