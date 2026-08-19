package com.awesomeapp.f624api

sealed class State707_8 {
    data object Loading : State707_8()
    data class Success(val data: String) : State707_8()
    data class Error(val message: String) : State707_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
