package com.awesomeapp.f115impl

sealed class State837_9 {
    data object Loading : State837_9()
    data class Success(val data: String) : State837_9()
    data class Error(val message: String) : State837_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
