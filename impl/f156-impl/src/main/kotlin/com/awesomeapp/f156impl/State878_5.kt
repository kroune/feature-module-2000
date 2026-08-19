package com.awesomeapp.f156impl

sealed class State878_5 {
    data object Loading : State878_5()
    data class Success(val data: String) : State878_5()
    data class Error(val message: String) : State878_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
