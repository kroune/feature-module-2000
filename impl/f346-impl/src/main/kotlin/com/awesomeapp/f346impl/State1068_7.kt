package com.awesomeapp.f346impl

sealed class State1068_7 {
    data object Loading : State1068_7()
    data class Success(val data: String) : State1068_7()
    data class Error(val message: String) : State1068_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
