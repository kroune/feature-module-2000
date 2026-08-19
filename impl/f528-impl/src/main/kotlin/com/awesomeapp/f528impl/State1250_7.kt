package com.awesomeapp.f528impl

sealed class State1250_7 {
    data object Loading : State1250_7()
    data class Success(val data: String) : State1250_7()
    data class Error(val message: String) : State1250_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
