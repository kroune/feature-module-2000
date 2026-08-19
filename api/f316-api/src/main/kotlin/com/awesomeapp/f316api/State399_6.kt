package com.awesomeapp.f316api

sealed class State399_6 {
    data object Loading : State399_6()
    data class Success(val data: String) : State399_6()
    data class Error(val message: String) : State399_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
