package com.awesomeapp.f311api

sealed class State394_5 {
    data object Loading : State394_5()
    data class Success(val data: String) : State394_5()
    data class Error(val message: String) : State394_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
