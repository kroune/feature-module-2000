package com.awesomeapp.f483api

sealed class State566_5 {
    data object Loading : State566_5()
    data class Success(val data: String) : State566_5()
    data class Error(val message: String) : State566_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
