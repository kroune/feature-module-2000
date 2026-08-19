package com.awesomeapp.f184api

sealed class State267_6 {
    data object Loading : State267_6()
    data class Success(val data: String) : State267_6()
    data class Error(val message: String) : State267_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
