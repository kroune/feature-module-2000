package com.awesomeapp.f131impl

sealed class State853_8 {
    data object Loading : State853_8()
    data class Success(val data: String) : State853_8()
    data class Error(val message: String) : State853_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
