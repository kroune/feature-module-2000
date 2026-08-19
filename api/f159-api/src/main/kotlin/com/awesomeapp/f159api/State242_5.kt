package com.awesomeapp.f159api

sealed class State242_5 {
    data object Loading : State242_5()
    data class Success(val data: String) : State242_5()
    data class Error(val message: String) : State242_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
