package com.awesomeapp.f389api

sealed class State472_10 {
    data object Loading : State472_10()
    data class Success(val data: String) : State472_10()
    data class Error(val message: String) : State472_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
