package com.awesomeapp.f435api

sealed class State518_5 {
    data object Loading : State518_5()
    data class Success(val data: String) : State518_5()
    data class Error(val message: String) : State518_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
