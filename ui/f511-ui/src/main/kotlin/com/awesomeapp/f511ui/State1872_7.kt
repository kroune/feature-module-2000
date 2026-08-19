package com.awesomeapp.f511ui

sealed class State1872_7 {
    data object Loading : State1872_7()
    data class Success(val data: String) : State1872_7()
    data class Error(val message: String) : State1872_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
