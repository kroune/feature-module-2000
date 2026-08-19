package com.awesomeapp.f635impl

sealed class State1357_8 {
    data object Loading : State1357_8()
    data class Success(val data: String) : State1357_8()
    data class Error(val message: String) : State1357_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
