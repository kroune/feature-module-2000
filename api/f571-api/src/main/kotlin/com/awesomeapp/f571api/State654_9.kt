package com.awesomeapp.f571api

sealed class State654_9 {
    data object Loading : State654_9()
    data class Success(val data: String) : State654_9()
    data class Error(val message: String) : State654_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
