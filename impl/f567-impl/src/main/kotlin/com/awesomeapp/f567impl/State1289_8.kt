package com.awesomeapp.f567impl

sealed class State1289_8 {
    data object Loading : State1289_8()
    data class Success(val data: String) : State1289_8()
    data class Error(val message: String) : State1289_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
