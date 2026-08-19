package com.awesomeapp.f279api

sealed class State362_8 {
    data object Loading : State362_8()
    data class Success(val data: String) : State362_8()
    data class Error(val message: String) : State362_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
