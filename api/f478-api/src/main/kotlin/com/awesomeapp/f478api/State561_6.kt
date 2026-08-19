package com.awesomeapp.f478api

sealed class State561_6 {
    data object Loading : State561_6()
    data class Success(val data: String) : State561_6()
    data class Error(val message: String) : State561_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
