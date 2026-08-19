package com.awesomeapp.f591api

sealed class State674_8 {
    data object Loading : State674_8()
    data class Success(val data: String) : State674_8()
    data class Error(val message: String) : State674_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
