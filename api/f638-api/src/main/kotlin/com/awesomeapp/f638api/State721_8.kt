package com.awesomeapp.f638api

sealed class State721_8 {
    data object Loading : State721_8()
    data class Success(val data: String) : State721_8()
    data class Error(val message: String) : State721_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
