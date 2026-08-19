package com.awesomeapp.f536api

sealed class State619_5 {
    data object Loading : State619_5()
    data class Success(val data: String) : State619_5()
    data class Error(val message: String) : State619_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
