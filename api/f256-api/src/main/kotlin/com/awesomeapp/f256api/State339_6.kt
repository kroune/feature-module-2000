package com.awesomeapp.f256api

sealed class State339_6 {
    data object Loading : State339_6()
    data class Success(val data: String) : State339_6()
    data class Error(val message: String) : State339_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
