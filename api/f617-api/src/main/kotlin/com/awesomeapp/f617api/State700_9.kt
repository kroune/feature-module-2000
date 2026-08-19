package com.awesomeapp.f617api

sealed class State700_9 {
    data object Loading : State700_9()
    data class Success(val data: String) : State700_9()
    data class Error(val message: String) : State700_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
