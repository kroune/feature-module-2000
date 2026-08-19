package com.awesomeapp.f296api

sealed class State379_5 {
    data object Loading : State379_5()
    data class Success(val data: String) : State379_5()
    data class Error(val message: String) : State379_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
