package com.awesomeapp.f413impl

sealed class State1135_7 {
    data object Loading : State1135_7()
    data class Success(val data: String) : State1135_7()
    data class Error(val message: String) : State1135_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
