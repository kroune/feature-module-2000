package com.awesomeapp.f623api

sealed class State706_8 {
    data object Loading : State706_8()
    data class Success(val data: String) : State706_8()
    data class Error(val message: String) : State706_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
