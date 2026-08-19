package com.awesomeapp.f309api

sealed class State392_7 {
    data object Loading : State392_7()
    data class Success(val data: String) : State392_7()
    data class Error(val message: String) : State392_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
