package com.awesomeapp.f206api

sealed class State289_5 {
    data object Loading : State289_5()
    data class Success(val data: String) : State289_5()
    data class Error(val message: String) : State289_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
