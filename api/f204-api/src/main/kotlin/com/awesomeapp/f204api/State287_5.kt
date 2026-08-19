package com.awesomeapp.f204api

sealed class State287_5 {
    data object Loading : State287_5()
    data class Success(val data: String) : State287_5()
    data class Error(val message: String) : State287_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
