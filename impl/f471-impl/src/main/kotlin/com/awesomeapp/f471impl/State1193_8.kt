package com.awesomeapp.f471impl

sealed class State1193_8 {
    data object Loading : State1193_8()
    data class Success(val data: String) : State1193_8()
    data class Error(val message: String) : State1193_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
