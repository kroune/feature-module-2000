package com.awesomeapp.f516api

sealed class State599_8 {
    data object Loading : State599_8()
    data class Success(val data: String) : State599_8()
    data class Error(val message: String) : State599_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
