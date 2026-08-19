package com.awesomeapp.f243api

sealed class State326_8 {
    data object Loading : State326_8()
    data class Success(val data: String) : State326_8()
    data class Error(val message: String) : State326_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
