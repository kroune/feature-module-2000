package com.awesomeapp.f283api

sealed class State366_6 {
    data object Loading : State366_6()
    data class Success(val data: String) : State366_6()
    data class Error(val message: String) : State366_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
