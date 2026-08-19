package com.awesomeapp.f440api

sealed class State523_5 {
    data object Loading : State523_5()
    data class Success(val data: String) : State523_5()
    data class Error(val message: String) : State523_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
