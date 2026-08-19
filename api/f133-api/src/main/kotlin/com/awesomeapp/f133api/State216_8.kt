package com.awesomeapp.f133api

sealed class State216_8 {
    data object Loading : State216_8()
    data class Success(val data: String) : State216_8()
    data class Error(val message: String) : State216_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
