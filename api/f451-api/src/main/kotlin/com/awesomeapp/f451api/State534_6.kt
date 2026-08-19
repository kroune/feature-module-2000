package com.awesomeapp.f451api

sealed class State534_6 {
    data object Loading : State534_6()
    data class Success(val data: String) : State534_6()
    data class Error(val message: String) : State534_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
