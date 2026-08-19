package com.awesomeapp.f188api

sealed class State271_8 {
    data object Loading : State271_8()
    data class Success(val data: String) : State271_8()
    data class Error(val message: String) : State271_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
