package com.awesomeapp.f472api

sealed class State555_8 {
    data object Loading : State555_8()
    data class Success(val data: String) : State555_8()
    data class Error(val message: String) : State555_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
