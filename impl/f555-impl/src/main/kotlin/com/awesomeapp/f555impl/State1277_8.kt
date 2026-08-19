package com.awesomeapp.f555impl

sealed class State1277_8 {
    data object Loading : State1277_8()
    data class Success(val data: String) : State1277_8()
    data class Error(val message: String) : State1277_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
