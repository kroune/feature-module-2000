package com.awesomeapp.f603api

sealed class State686_5 {
    data object Loading : State686_5()
    data class Success(val data: String) : State686_5()
    data class Error(val message: String) : State686_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
