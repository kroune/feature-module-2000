package com.awesomeapp.f150api

sealed class State233_8 {
    data object Loading : State233_8()
    data class Success(val data: String) : State233_8()
    data class Error(val message: String) : State233_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
