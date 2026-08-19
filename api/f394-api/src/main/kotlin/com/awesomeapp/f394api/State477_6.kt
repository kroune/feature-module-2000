package com.awesomeapp.f394api

sealed class State477_6 {
    data object Loading : State477_6()
    data class Success(val data: String) : State477_6()
    data class Error(val message: String) : State477_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
