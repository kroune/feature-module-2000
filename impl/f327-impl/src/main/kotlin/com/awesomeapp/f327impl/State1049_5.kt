package com.awesomeapp.f327impl

sealed class State1049_5 {
    data object Loading : State1049_5()
    data class Success(val data: String) : State1049_5()
    data class Error(val message: String) : State1049_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
