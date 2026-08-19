package com.awesomeapp.f486impl

sealed class State1208_6 {
    data object Loading : State1208_6()
    data class Success(val data: String) : State1208_6()
    data class Error(val message: String) : State1208_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
