package com.awesomeapp.f228api

sealed class State311_8 {
    data object Loading : State311_8()
    data class Success(val data: String) : State311_8()
    data class Error(val message: String) : State311_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
