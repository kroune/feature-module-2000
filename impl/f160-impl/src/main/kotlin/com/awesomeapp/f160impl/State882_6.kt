package com.awesomeapp.f160impl

sealed class State882_6 {
    data object Loading : State882_6()
    data class Success(val data: String) : State882_6()
    data class Error(val message: String) : State882_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
