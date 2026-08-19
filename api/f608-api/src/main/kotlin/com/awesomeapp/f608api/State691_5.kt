package com.awesomeapp.f608api

sealed class State691_5 {
    data object Loading : State691_5()
    data class Success(val data: String) : State691_5()
    data class Error(val message: String) : State691_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
