package com.awesomeapp.f213api

sealed class State296_10 {
    data object Loading : State296_10()
    data class Success(val data: String) : State296_10()
    data class Error(val message: String) : State296_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
