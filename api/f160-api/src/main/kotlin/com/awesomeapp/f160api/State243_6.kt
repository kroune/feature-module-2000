package com.awesomeapp.f160api

sealed class State243_6 {
    data object Loading : State243_6()
    data class Success(val data: String) : State243_6()
    data class Error(val message: String) : State243_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
