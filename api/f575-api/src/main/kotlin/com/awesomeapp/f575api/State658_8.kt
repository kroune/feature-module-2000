package com.awesomeapp.f575api

sealed class State658_8 {
    data object Loading : State658_8()
    data class Success(val data: String) : State658_8()
    data class Error(val message: String) : State658_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
