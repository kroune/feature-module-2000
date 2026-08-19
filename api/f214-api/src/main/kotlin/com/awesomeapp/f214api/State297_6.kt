package com.awesomeapp.f214api

sealed class State297_6 {
    data object Loading : State297_6()
    data class Success(val data: String) : State297_6()
    data class Error(val message: String) : State297_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
