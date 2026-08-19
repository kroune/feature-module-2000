package com.awesomeapp.f202api

sealed class State285_8 {
    data object Loading : State285_8()
    data class Success(val data: String) : State285_8()
    data class Error(val message: String) : State285_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
