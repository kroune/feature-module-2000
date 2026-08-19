package com.awesomeapp.f528api

sealed class State611_8 {
    data object Loading : State611_8()
    data class Success(val data: String) : State611_8()
    data class Error(val message: String) : State611_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
