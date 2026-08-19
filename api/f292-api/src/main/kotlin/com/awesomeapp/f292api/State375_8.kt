package com.awesomeapp.f292api

sealed class State375_8 {
    data object Loading : State375_8()
    data class Success(val data: String) : State375_8()
    data class Error(val message: String) : State375_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
