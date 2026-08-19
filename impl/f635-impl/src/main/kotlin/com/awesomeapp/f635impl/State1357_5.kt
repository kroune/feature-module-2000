package com.awesomeapp.f635impl

sealed class State1357_5 {
    data object Loading : State1357_5()
    data class Success(val data: String) : State1357_5()
    data class Error(val message: String) : State1357_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
