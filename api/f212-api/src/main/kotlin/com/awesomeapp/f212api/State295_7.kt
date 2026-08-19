package com.awesomeapp.f212api

sealed class State295_7 {
    data object Loading : State295_7()
    data class Success(val data: String) : State295_7()
    data class Error(val message: String) : State295_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
