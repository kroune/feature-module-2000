package com.awesomeapp.f487api

sealed class State570_8 {
    data object Loading : State570_8()
    data class Success(val data: String) : State570_8()
    data class Error(val message: String) : State570_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
