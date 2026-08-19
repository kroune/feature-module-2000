package com.awesomeapp.f339impl

sealed class State1061_8 {
    data object Loading : State1061_8()
    data class Success(val data: String) : State1061_8()
    data class Error(val message: String) : State1061_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
