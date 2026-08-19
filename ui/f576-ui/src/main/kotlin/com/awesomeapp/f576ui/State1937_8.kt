package com.awesomeapp.f576ui

sealed class State1937_8 {
    data object Loading : State1937_8()
    data class Success(val data: String) : State1937_8()
    data class Error(val message: String) : State1937_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
