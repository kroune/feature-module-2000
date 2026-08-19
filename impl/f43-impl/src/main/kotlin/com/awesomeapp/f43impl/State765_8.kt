package com.awesomeapp.f43impl

sealed class State765_8 {
    data object Loading : State765_8()
    data class Success(val data: String) : State765_8()
    data class Error(val message: String) : State765_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
