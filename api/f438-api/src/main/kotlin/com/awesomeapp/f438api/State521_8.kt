package com.awesomeapp.f438api

sealed class State521_8 {
    data object Loading : State521_8()
    data class Success(val data: String) : State521_8()
    data class Error(val message: String) : State521_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
