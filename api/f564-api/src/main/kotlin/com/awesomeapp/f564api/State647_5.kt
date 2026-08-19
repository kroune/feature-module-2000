package com.awesomeapp.f564api

sealed class State647_5 {
    data object Loading : State647_5()
    data class Success(val data: String) : State647_5()
    data class Error(val message: String) : State647_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
