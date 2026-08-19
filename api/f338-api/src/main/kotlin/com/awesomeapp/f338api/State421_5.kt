package com.awesomeapp.f338api

sealed class State421_5 {
    data object Loading : State421_5()
    data class Success(val data: String) : State421_5()
    data class Error(val message: String) : State421_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
