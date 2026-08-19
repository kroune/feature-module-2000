package com.awesomeapp.f596ui

sealed class State1957_8 {
    data object Loading : State1957_8()
    data class Success(val data: String) : State1957_8()
    data class Error(val message: String) : State1957_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
