package com.awesomeapp.f240api

sealed class State323_5 {
    data object Loading : State323_5()
    data class Success(val data: String) : State323_5()
    data class Error(val message: String) : State323_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
