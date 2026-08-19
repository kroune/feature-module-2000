package com.awesomeapp.f159impl

sealed class State881_5 {
    data object Loading : State881_5()
    data class Success(val data: String) : State881_5()
    data class Error(val message: String) : State881_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
