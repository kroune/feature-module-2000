package com.awesomeapp.f419api

sealed class State502_8 {
    data object Loading : State502_8()
    data class Success(val data: String) : State502_8()
    data class Error(val message: String) : State502_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
