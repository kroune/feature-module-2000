package com.awesomeapp.f367api

sealed class State450_8 {
    data object Loading : State450_8()
    data class Success(val data: String) : State450_8()
    data class Error(val message: String) : State450_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
