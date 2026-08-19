package com.awesomeapp.f438api

sealed class State521_5 {
    data object Loading : State521_5()
    data class Success(val data: String) : State521_5()
    data class Error(val message: String) : State521_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
