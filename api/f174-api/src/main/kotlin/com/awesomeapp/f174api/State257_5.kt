package com.awesomeapp.f174api

sealed class State257_5 {
    data object Loading : State257_5()
    data class Success(val data: String) : State257_5()
    data class Error(val message: String) : State257_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
