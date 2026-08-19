package com.awesomeapp.f603api

sealed class State686_8 {
    data object Loading : State686_8()
    data class Success(val data: String) : State686_8()
    data class Error(val message: String) : State686_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
