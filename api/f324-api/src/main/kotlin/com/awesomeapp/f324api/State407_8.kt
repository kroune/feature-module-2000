package com.awesomeapp.f324api

sealed class State407_8 {
    data object Loading : State407_8()
    data class Success(val data: String) : State407_8()
    data class Error(val message: String) : State407_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
