package com.awesomeapp.f210api

sealed class State293_8 {
    data object Loading : State293_8()
    data class Success(val data: String) : State293_8()
    data class Error(val message: String) : State293_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
