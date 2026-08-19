package com.awesomeapp.f388api

sealed class State471_6 {
    data object Loading : State471_6()
    data class Success(val data: String) : State471_6()
    data class Error(val message: String) : State471_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
