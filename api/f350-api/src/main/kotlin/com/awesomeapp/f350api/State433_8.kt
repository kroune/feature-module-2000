package com.awesomeapp.f350api

sealed class State433_8 {
    data object Loading : State433_8()
    data class Success(val data: String) : State433_8()
    data class Error(val message: String) : State433_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
