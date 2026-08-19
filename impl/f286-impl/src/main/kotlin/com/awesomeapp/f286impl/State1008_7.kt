package com.awesomeapp.f286impl

sealed class State1008_7 {
    data object Loading : State1008_7()
    data class Success(val data: String) : State1008_7()
    data class Error(val message: String) : State1008_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
