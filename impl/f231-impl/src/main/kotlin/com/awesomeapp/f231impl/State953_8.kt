package com.awesomeapp.f231impl

sealed class State953_8 {
    data object Loading : State953_8()
    data class Success(val data: String) : State953_8()
    data class Error(val message: String) : State953_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
