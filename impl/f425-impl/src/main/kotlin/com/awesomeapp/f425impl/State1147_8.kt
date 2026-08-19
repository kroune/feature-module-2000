package com.awesomeapp.f425impl

sealed class State1147_8 {
    data object Loading : State1147_8()
    data class Success(val data: String) : State1147_8()
    data class Error(val message: String) : State1147_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
