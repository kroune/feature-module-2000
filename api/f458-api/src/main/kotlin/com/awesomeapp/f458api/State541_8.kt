package com.awesomeapp.f458api

sealed class State541_8 {
    data object Loading : State541_8()
    data class Success(val data: String) : State541_8()
    data class Error(val message: String) : State541_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
