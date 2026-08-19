package com.awesomeapp.f194api

sealed class State277_8 {
    data object Loading : State277_8()
    data class Success(val data: String) : State277_8()
    data class Error(val message: String) : State277_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
