package com.awesomeapp.f241api

sealed class State324_8 {
    data object Loading : State324_8()
    data class Success(val data: String) : State324_8()
    data class Error(val message: String) : State324_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
