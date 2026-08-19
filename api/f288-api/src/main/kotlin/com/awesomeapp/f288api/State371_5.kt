package com.awesomeapp.f288api

sealed class State371_5 {
    data object Loading : State371_5()
    data class Success(val data: String) : State371_5()
    data class Error(val message: String) : State371_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
