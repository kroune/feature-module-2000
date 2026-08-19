package com.awesomeapp.f524api

sealed class State607_8 {
    data object Loading : State607_8()
    data class Success(val data: String) : State607_8()
    data class Error(val message: String) : State607_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
