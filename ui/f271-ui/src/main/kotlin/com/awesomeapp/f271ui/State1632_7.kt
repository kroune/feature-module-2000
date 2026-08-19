package com.awesomeapp.f271ui

sealed class State1632_7 {
    data object Loading : State1632_7()
    data class Success(val data: String) : State1632_7()
    data class Error(val message: String) : State1632_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
