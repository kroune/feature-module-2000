package com.awesomeapp.f536api

sealed class State619_8 {
    data object Loading : State619_8()
    data class Success(val data: String) : State619_8()
    data class Error(val message: String) : State619_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
