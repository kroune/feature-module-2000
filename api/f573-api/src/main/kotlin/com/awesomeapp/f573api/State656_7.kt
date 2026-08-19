package com.awesomeapp.f573api

sealed class State656_7 {
    data object Loading : State656_7()
    data class Success(val data: String) : State656_7()
    data class Error(val message: String) : State656_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
