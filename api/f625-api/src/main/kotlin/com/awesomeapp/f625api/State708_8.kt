package com.awesomeapp.f625api

sealed class State708_8 {
    data object Loading : State708_8()
    data class Success(val data: String) : State708_8()
    data class Error(val message: String) : State708_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
