package com.awesomeapp.f206api

sealed class State289_8 {
    data object Loading : State289_8()
    data class Success(val data: String) : State289_8()
    data class Error(val message: String) : State289_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
