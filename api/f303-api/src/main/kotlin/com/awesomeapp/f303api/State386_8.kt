package com.awesomeapp.f303api

sealed class State386_8 {
    data object Loading : State386_8()
    data class Success(val data: String) : State386_8()
    data class Error(val message: String) : State386_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
