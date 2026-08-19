package com.awesomeapp.f149impl

sealed class State871_5 {
    data object Loading : State871_5()
    data class Success(val data: String) : State871_5()
    data class Error(val message: String) : State871_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
