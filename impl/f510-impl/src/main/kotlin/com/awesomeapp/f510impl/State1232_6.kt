package com.awesomeapp.f510impl

sealed class State1232_6 {
    data object Loading : State1232_6()
    data class Success(val data: String) : State1232_6()
    data class Error(val message: String) : State1232_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
