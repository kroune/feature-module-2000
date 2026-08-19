package com.awesomeapp.f491api

sealed class State574_5 {
    data object Loading : State574_5()
    data class Success(val data: String) : State574_5()
    data class Error(val message: String) : State574_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
