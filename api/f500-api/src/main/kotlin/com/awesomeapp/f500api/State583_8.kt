package com.awesomeapp.f500api

sealed class State583_8 {
    data object Loading : State583_8()
    data class Success(val data: String) : State583_8()
    data class Error(val message: String) : State583_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
