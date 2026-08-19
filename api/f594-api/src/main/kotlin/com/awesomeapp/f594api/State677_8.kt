package com.awesomeapp.f594api

sealed class State677_8 {
    data object Loading : State677_8()
    data class Success(val data: String) : State677_8()
    data class Error(val message: String) : State677_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
