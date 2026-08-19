package com.awesomeapp.f444api

sealed class State527_5 {
    data object Loading : State527_5()
    data class Success(val data: String) : State527_5()
    data class Error(val message: String) : State527_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
