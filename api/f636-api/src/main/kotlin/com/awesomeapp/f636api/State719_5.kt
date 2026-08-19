package com.awesomeapp.f636api

sealed class State719_5 {
    data object Loading : State719_5()
    data class Success(val data: String) : State719_5()
    data class Error(val message: String) : State719_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
