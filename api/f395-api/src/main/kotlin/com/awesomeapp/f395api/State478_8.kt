package com.awesomeapp.f395api

sealed class State478_8 {
    data object Loading : State478_8()
    data class Success(val data: String) : State478_8()
    data class Error(val message: String) : State478_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
