package com.awesomeapp.f5impl

sealed class State727_8 {
    data object Loading : State727_8()
    data class Success(val data: String) : State727_8()
    data class Error(val message: String) : State727_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
