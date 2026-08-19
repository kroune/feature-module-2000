package com.awesomeapp.f138api

sealed class State221_5 {
    data object Loading : State221_5()
    data class Success(val data: String) : State221_5()
    data class Error(val message: String) : State221_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
