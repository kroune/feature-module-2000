package com.awesomeapp.f635api

sealed class State718_8 {
    data object Loading : State718_8()
    data class Success(val data: String) : State718_8()
    data class Error(val message: String) : State718_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
