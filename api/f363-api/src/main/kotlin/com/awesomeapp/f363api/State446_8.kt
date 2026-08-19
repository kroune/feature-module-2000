package com.awesomeapp.f363api

sealed class State446_8 {
    data object Loading : State446_8()
    data class Success(val data: String) : State446_8()
    data class Error(val message: String) : State446_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
