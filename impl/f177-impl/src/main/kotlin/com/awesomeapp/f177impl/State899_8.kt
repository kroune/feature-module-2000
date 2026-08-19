package com.awesomeapp.f177impl

sealed class State899_8 {
    data object Loading : State899_8()
    data class Success(val data: String) : State899_8()
    data class Error(val message: String) : State899_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
