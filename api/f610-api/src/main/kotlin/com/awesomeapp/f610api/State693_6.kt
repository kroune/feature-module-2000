package com.awesomeapp.f610api

sealed class State693_6 {
    data object Loading : State693_6()
    data class Success(val data: String) : State693_6()
    data class Error(val message: String) : State693_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
