package com.awesomeapp.f326api

sealed class State409_5 {
    data object Loading : State409_5()
    data class Success(val data: String) : State409_5()
    data class Error(val message: String) : State409_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
