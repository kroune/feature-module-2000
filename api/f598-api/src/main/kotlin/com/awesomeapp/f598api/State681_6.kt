package com.awesomeapp.f598api

sealed class State681_6 {
    data object Loading : State681_6()
    data class Success(val data: String) : State681_6()
    data class Error(val message: String) : State681_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
