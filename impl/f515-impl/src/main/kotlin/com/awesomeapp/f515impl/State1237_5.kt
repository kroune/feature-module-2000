package com.awesomeapp.f515impl

sealed class State1237_5 {
    data object Loading : State1237_5()
    data class Success(val data: String) : State1237_5()
    data class Error(val message: String) : State1237_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
