package com.awesomeapp.f583api

sealed class State666_6 {
    data object Loading : State666_6()
    data class Success(val data: String) : State666_6()
    data class Error(val message: String) : State666_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
