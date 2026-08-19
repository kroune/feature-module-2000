package com.awesomeapp.f634api

sealed class State717_9 {
    data object Loading : State717_9()
    data class Success(val data: String) : State717_9()
    data class Error(val message: String) : State717_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
