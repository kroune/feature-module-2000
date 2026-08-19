package com.awesomeapp.f345ui

sealed class State1706_8 {
    data object Loading : State1706_8()
    data class Success(val data: String) : State1706_8()
    data class Error(val message: String) : State1706_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
