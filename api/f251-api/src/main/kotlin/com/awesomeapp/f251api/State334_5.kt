package com.awesomeapp.f251api

sealed class State334_5 {
    data object Loading : State334_5()
    data class Success(val data: String) : State334_5()
    data class Error(val message: String) : State334_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
