package com.awesomeapp.f483api

sealed class State566_8 {
    data object Loading : State566_8()
    data class Success(val data: String) : State566_8()
    data class Error(val message: String) : State566_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
