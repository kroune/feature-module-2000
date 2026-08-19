package com.awesomeapp.f636api

sealed class State719_8 {
    data object Loading : State719_8()
    data class Success(val data: String) : State719_8()
    data class Error(val message: String) : State719_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
