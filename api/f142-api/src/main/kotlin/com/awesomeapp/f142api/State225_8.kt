package com.awesomeapp.f142api

sealed class State225_8 {
    data object Loading : State225_8()
    data class Success(val data: String) : State225_8()
    data class Error(val message: String) : State225_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
