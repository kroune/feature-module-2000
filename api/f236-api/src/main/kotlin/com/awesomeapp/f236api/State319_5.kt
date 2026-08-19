package com.awesomeapp.f236api

sealed class State319_5 {
    data object Loading : State319_5()
    data class Success(val data: String) : State319_5()
    data class Error(val message: String) : State319_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
