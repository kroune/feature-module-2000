package com.awesomeapp.f240api

sealed class State323_8 {
    data object Loading : State323_8()
    data class Success(val data: String) : State323_8()
    data class Error(val message: String) : State323_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
