package com.awesomeapp.f281api

sealed class State364_7 {
    data object Loading : State364_7()
    data class Success(val data: String) : State364_7()
    data class Error(val message: String) : State364_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
