package com.awesomeapp.f250api

sealed class State333_6 {
    data object Loading : State333_6()
    data class Success(val data: String) : State333_6()
    data class Error(val message: String) : State333_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
