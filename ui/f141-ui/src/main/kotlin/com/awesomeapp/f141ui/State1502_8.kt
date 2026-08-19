package com.awesomeapp.f141ui

sealed class State1502_8 {
    data object Loading : State1502_8()
    data class Success(val data: String) : State1502_8()
    data class Error(val message: String) : State1502_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
