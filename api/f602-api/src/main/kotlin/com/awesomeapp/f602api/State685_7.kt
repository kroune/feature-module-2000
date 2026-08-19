package com.awesomeapp.f602api

sealed class State685_7 {
    data object Loading : State685_7()
    data class Success(val data: String) : State685_7()
    data class Error(val message: String) : State685_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
