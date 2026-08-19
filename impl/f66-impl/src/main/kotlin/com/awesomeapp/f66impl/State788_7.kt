package com.awesomeapp.f66impl

sealed class State788_7 {
    data object Loading : State788_7()
    data class Success(val data: String) : State788_7()
    data class Error(val message: String) : State788_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
