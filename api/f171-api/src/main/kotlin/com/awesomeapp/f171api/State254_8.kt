package com.awesomeapp.f171api

sealed class State254_8 {
    data object Loading : State254_8()
    data class Success(val data: String) : State254_8()
    data class Error(val message: String) : State254_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
