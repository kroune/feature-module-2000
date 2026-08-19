package com.awesomeapp.f169api

sealed class State252_8 {
    data object Loading : State252_8()
    data class Success(val data: String) : State252_8()
    data class Error(val message: String) : State252_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
