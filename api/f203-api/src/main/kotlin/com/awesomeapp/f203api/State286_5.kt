package com.awesomeapp.f203api

sealed class State286_5 {
    data object Loading : State286_5()
    data class Success(val data: String) : State286_5()
    data class Error(val message: String) : State286_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
