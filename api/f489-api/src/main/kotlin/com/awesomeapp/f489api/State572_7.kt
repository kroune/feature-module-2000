package com.awesomeapp.f489api

sealed class State572_7 {
    data object Loading : State572_7()
    data class Success(val data: String) : State572_7()
    data class Error(val message: String) : State572_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
