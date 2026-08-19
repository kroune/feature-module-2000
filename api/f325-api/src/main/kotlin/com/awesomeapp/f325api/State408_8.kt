package com.awesomeapp.f325api

sealed class State408_8 {
    data object Loading : State408_8()
    data class Success(val data: String) : State408_8()
    data class Error(val message: String) : State408_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
