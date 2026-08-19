package com.awesomeapp.f137api

sealed class State220_9 {
    data object Loading : State220_9()
    data class Success(val data: String) : State220_9()
    data class Error(val message: String) : State220_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
