package com.awesomeapp.f132api

sealed class State215_7 {
    data object Loading : State215_7()
    data class Success(val data: String) : State215_7()
    data class Error(val message: String) : State215_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
