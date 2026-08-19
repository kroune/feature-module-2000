package com.awesomeapp.f339api

sealed class State422_5 {
    data object Loading : State422_5()
    data class Success(val data: String) : State422_5()
    data class Error(val message: String) : State422_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
