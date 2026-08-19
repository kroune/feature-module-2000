package com.awesomeapp.f318api

sealed class State401_8 {
    data object Loading : State401_8()
    data class Success(val data: String) : State401_8()
    data class Error(val message: String) : State401_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
