package com.awesomeapp.f524api

sealed class State607_5 {
    data object Loading : State607_5()
    data class Success(val data: String) : State607_5()
    data class Error(val message: String) : State607_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
