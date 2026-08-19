package com.awesomeapp.f376api

sealed class State459_6 {
    data object Loading : State459_6()
    data class Success(val data: String) : State459_6()
    data class Error(val message: String) : State459_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
