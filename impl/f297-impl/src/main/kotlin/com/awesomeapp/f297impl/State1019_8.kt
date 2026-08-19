package com.awesomeapp.f297impl

sealed class State1019_8 {
    data object Loading : State1019_8()
    data class Success(val data: String) : State1019_8()
    data class Error(val message: String) : State1019_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
