package com.awesomeapp.f272api

sealed class State355_7 {
    data object Loading : State355_7()
    data class Success(val data: String) : State355_7()
    data class Error(val message: String) : State355_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
