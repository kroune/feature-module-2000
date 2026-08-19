package com.awesomeapp.f566api

sealed class State649_8 {
    data object Loading : State649_8()
    data class Success(val data: String) : State649_8()
    data class Error(val message: String) : State649_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
