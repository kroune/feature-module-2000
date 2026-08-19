package com.awesomeapp.f8impl

sealed class State730_7 {
    data object Loading : State730_7()
    data class Success(val data: String) : State730_7()
    data class Error(val message: String) : State730_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
