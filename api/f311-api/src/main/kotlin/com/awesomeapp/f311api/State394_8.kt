package com.awesomeapp.f311api

sealed class State394_8 {
    data object Loading : State394_8()
    data class Success(val data: String) : State394_8()
    data class Error(val message: String) : State394_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
