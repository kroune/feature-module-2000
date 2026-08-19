package com.awesomeapp.f436api

sealed class State519_6 {
    data object Loading : State519_6()
    data class Success(val data: String) : State519_6()
    data class Error(val message: String) : State519_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
