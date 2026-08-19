package com.awesomeapp.f144api

sealed class State227_5 {
    data object Loading : State227_5()
    data class Success(val data: String) : State227_5()
    data class Error(val message: String) : State227_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
