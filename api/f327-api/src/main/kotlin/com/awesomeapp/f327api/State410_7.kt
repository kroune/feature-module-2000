package com.awesomeapp.f327api

sealed class State410_7 {
    data object Loading : State410_7()
    data class Success(val data: String) : State410_7()
    data class Error(val message: String) : State410_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
