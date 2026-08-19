package com.awesomeapp.f315api

sealed class State398_5 {
    data object Loading : State398_5()
    data class Success(val data: String) : State398_5()
    data class Error(val message: String) : State398_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
