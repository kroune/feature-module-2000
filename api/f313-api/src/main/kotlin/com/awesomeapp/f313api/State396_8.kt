package com.awesomeapp.f313api

sealed class State396_8 {
    data object Loading : State396_8()
    data class Success(val data: String) : State396_8()
    data class Error(val message: String) : State396_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
