package com.awesomeapp.f432impl

sealed class State1154_5 {
    data object Loading : State1154_5()
    data class Success(val data: String) : State1154_5()
    data class Error(val message: String) : State1154_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
