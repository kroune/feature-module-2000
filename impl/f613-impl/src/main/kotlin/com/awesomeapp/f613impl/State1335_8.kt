package com.awesomeapp.f613impl

sealed class State1335_8 {
    data object Loading : State1335_8()
    data class Success(val data: String) : State1335_8()
    data class Error(val message: String) : State1335_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
