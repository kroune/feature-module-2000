package com.awesomeapp.f327impl

sealed class State1049_8 {
    data object Loading : State1049_8()
    data class Success(val data: String) : State1049_8()
    data class Error(val message: String) : State1049_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
