package com.awesomeapp.f504api

sealed class State587_5 {
    data object Loading : State587_5()
    data class Success(val data: String) : State587_5()
    data class Error(val message: String) : State587_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
