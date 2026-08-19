package com.awesomeapp.f503api

sealed class State586_5 {
    data object Loading : State586_5()
    data class Success(val data: String) : State586_5()
    data class Error(val message: String) : State586_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
