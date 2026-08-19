package com.awesomeapp.f159api

sealed class State242_8 {
    data object Loading : State242_8()
    data class Success(val data: String) : State242_8()
    data class Error(val message: String) : State242_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
