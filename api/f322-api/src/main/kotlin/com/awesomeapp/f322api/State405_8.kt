package com.awesomeapp.f322api

sealed class State405_8 {
    data object Loading : State405_8()
    data class Success(val data: String) : State405_8()
    data class Error(val message: String) : State405_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
