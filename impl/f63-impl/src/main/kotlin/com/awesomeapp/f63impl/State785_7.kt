package com.awesomeapp.f63impl

sealed class State785_7 {
    data object Loading : State785_7()
    data class Success(val data: String) : State785_7()
    data class Error(val message: String) : State785_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
