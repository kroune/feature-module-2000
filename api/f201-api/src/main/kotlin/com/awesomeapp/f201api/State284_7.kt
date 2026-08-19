package com.awesomeapp.f201api

sealed class State284_7 {
    data object Loading : State284_7()
    data class Success(val data: String) : State284_7()
    data class Error(val message: String) : State284_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
