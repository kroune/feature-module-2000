package com.awesomeapp.f486api

sealed class State569_8 {
    data object Loading : State569_8()
    data class Success(val data: String) : State569_8()
    data class Error(val message: String) : State569_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
