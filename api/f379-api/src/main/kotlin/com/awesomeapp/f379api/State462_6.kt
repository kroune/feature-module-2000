package com.awesomeapp.f379api

sealed class State462_6 {
    data object Loading : State462_6()
    data class Success(val data: String) : State462_6()
    data class Error(val message: String) : State462_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
