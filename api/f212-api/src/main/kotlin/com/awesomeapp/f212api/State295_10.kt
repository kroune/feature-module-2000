package com.awesomeapp.f212api

sealed class State295_10 {
    data object Loading : State295_10()
    data class Success(val data: String) : State295_10()
    data class Error(val message: String) : State295_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
