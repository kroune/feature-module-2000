package com.awesomeapp.f365api

sealed class State448_7 {
    data object Loading : State448_7()
    data class Success(val data: String) : State448_7()
    data class Error(val message: String) : State448_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
