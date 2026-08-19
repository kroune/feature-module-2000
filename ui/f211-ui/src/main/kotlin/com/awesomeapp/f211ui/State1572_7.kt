package com.awesomeapp.f211ui

sealed class State1572_7 {
    data object Loading : State1572_7()
    data class Success(val data: String) : State1572_7()
    data class Error(val message: String) : State1572_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
