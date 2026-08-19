package com.awesomeapp.f162impl

sealed class State884_7 {
    data object Loading : State884_7()
    data class Success(val data: String) : State884_7()
    data class Error(val message: String) : State884_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
