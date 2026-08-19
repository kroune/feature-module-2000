package com.awesomeapp.f219api

sealed class State302_8 {
    data object Loading : State302_8()
    data class Success(val data: String) : State302_8()
    data class Error(val message: String) : State302_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
