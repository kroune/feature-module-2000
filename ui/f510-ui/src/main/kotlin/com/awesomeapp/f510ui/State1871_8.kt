package com.awesomeapp.f510ui

sealed class State1871_8 {
    data object Loading : State1871_8()
    data class Success(val data: String) : State1871_8()
    data class Error(val message: String) : State1871_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
