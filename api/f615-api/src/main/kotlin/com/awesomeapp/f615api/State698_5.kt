package com.awesomeapp.f615api

sealed class State698_5 {
    data object Loading : State698_5()
    data class Success(val data: String) : State698_5()
    data class Error(val message: String) : State698_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
