package com.awesomeapp.f429api

sealed class State512_10 {
    data object Loading : State512_10()
    data class Success(val data: String) : State512_10()
    data class Error(val message: String) : State512_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
