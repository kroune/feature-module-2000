package com.awesomeapp.f174ui

sealed class State1535_7 {
    data object Loading : State1535_7()
    data class Success(val data: String) : State1535_7()
    data class Error(val message: String) : State1535_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
