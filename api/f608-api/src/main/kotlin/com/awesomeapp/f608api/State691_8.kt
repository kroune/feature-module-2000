package com.awesomeapp.f608api

sealed class State691_8 {
    data object Loading : State691_8()
    data class Success(val data: String) : State691_8()
    data class Error(val message: String) : State691_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
