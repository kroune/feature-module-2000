package com.awesomeapp.f390api

sealed class State473_8 {
    data object Loading : State473_8()
    data class Success(val data: String) : State473_8()
    data class Error(val message: String) : State473_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
