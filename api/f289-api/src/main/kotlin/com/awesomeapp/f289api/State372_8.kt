package com.awesomeapp.f289api

sealed class State372_8 {
    data object Loading : State372_8()
    data class Success(val data: String) : State372_8()
    data class Error(val message: String) : State372_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
