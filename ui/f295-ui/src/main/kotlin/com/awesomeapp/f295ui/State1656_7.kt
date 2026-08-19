package com.awesomeapp.f295ui

sealed class State1656_7 {
    data object Loading : State1656_7()
    data class Success(val data: String) : State1656_7()
    data class Error(val message: String) : State1656_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
