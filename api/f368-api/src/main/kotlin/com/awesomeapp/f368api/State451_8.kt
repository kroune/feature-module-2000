package com.awesomeapp.f368api

sealed class State451_8 {
    data object Loading : State451_8()
    data class Success(val data: String) : State451_8()
    data class Error(val message: String) : State451_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
