package com.awesomeapp.f368api

sealed class State451_5 {
    data object Loading : State451_5()
    data class Success(val data: String) : State451_5()
    data class Error(val message: String) : State451_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
