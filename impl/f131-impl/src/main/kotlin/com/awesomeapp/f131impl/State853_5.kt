package com.awesomeapp.f131impl

sealed class State853_5 {
    data object Loading : State853_5()
    data class Success(val data: String) : State853_5()
    data class Error(val message: String) : State853_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
