package com.awesomeapp.f260api

sealed class State343_5 {
    data object Loading : State343_5()
    data class Success(val data: String) : State343_5()
    data class Error(val message: String) : State343_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
