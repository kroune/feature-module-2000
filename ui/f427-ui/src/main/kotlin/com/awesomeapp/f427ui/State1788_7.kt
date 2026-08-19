package com.awesomeapp.f427ui

sealed class State1788_7 {
    data object Loading : State1788_7()
    data class Success(val data: String) : State1788_7()
    data class Error(val message: String) : State1788_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
