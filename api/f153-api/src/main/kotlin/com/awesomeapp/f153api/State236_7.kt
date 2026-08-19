package com.awesomeapp.f153api

sealed class State236_7 {
    data object Loading : State236_7()
    data class Success(val data: String) : State236_7()
    data class Error(val message: String) : State236_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
