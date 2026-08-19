package com.awesomeapp.f248api

sealed class State331_5 {
    data object Loading : State331_5()
    data class Success(val data: String) : State331_5()
    data class Error(val message: String) : State331_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
