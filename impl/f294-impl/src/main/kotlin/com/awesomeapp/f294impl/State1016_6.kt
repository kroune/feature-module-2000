package com.awesomeapp.f294impl

sealed class State1016_6 {
    data object Loading : State1016_6()
    data class Success(val data: String) : State1016_6()
    data class Error(val message: String) : State1016_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
