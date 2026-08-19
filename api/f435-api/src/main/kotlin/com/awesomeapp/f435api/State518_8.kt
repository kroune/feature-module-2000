package com.awesomeapp.f435api

sealed class State518_8 {
    data object Loading : State518_8()
    data class Success(val data: String) : State518_8()
    data class Error(val message: String) : State518_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
