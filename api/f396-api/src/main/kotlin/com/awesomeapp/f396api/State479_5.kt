package com.awesomeapp.f396api

sealed class State479_5 {
    data object Loading : State479_5()
    data class Success(val data: String) : State479_5()
    data class Error(val message: String) : State479_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
