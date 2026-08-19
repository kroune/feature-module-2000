package com.awesomeapp.f275api

sealed class State358_8 {
    data object Loading : State358_8()
    data class Success(val data: String) : State358_8()
    data class Error(val message: String) : State358_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
