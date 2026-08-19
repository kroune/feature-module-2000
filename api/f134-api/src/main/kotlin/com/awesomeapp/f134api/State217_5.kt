package com.awesomeapp.f134api

sealed class State217_5 {
    data object Loading : State217_5()
    data class Success(val data: String) : State217_5()
    data class Error(val message: String) : State217_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
