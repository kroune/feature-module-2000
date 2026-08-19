package com.awesomeapp.f225impl

sealed class State947_8 {
    data object Loading : State947_8()
    data class Success(val data: String) : State947_8()
    data class Error(val message: String) : State947_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
