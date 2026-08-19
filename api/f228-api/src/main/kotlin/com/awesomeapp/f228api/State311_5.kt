package com.awesomeapp.f228api

sealed class State311_5 {
    data object Loading : State311_5()
    data class Success(val data: String) : State311_5()
    data class Error(val message: String) : State311_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
