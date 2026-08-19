package com.awesomeapp.f604api

sealed class State687_6 {
    data object Loading : State687_6()
    data class Success(val data: String) : State687_6()
    data class Error(val message: String) : State687_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
