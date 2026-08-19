package com.awesomeapp.f220api

sealed class State303_6 {
    data object Loading : State303_6()
    data class Success(val data: String) : State303_6()
    data class Error(val message: String) : State303_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
