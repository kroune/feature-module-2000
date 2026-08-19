package com.awesomeapp.f244api

sealed class State327_6 {
    data object Loading : State327_6()
    data class Success(val data: String) : State327_6()
    data class Error(val message: String) : State327_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
