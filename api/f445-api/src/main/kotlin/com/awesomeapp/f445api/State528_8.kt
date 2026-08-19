package com.awesomeapp.f445api

sealed class State528_8 {
    data object Loading : State528_8()
    data class Success(val data: String) : State528_8()
    data class Error(val message: String) : State528_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
