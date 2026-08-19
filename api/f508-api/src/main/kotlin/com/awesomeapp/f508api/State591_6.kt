package com.awesomeapp.f508api

sealed class State591_6 {
    data object Loading : State591_6()
    data class Success(val data: String) : State591_6()
    data class Error(val message: String) : State591_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
