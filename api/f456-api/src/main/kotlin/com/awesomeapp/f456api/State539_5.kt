package com.awesomeapp.f456api

sealed class State539_5 {
    data object Loading : State539_5()
    data class Success(val data: String) : State539_5()
    data class Error(val message: String) : State539_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
