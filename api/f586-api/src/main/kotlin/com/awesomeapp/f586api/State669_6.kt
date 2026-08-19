package com.awesomeapp.f586api

sealed class State669_6 {
    data object Loading : State669_6()
    data class Success(val data: String) : State669_6()
    data class Error(val message: String) : State669_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
