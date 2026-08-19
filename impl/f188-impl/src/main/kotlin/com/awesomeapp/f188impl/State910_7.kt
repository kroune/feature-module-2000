package com.awesomeapp.f188impl

sealed class State910_7 {
    data object Loading : State910_7()
    data class Success(val data: String) : State910_7()
    data class Error(val message: String) : State910_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
