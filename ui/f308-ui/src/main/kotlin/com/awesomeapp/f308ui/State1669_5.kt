package com.awesomeapp.f308ui

sealed class State1669_5 {
    data object Loading : State1669_5()
    data class Success(val data: String) : State1669_5()
    data class Error(val message: String) : State1669_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
