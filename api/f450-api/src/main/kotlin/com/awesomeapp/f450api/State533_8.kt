package com.awesomeapp.f450api

sealed class State533_8 {
    data object Loading : State533_8()
    data class Success(val data: String) : State533_8()
    data class Error(val message: String) : State533_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
