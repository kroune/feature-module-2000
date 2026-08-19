package com.awesomeapp.f393api

sealed class State476_10 {
    data object Loading : State476_10()
    data class Success(val data: String) : State476_10()
    data class Error(val message: String) : State476_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
