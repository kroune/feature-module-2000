package com.awesomeapp.f511api

sealed class State594_6 {
    data object Loading : State594_6()
    data class Success(val data: String) : State594_6()
    data class Error(val message: String) : State594_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
