package com.awesomeapp.f46ui

sealed class State1407_6 {
    data object Loading : State1407_6()
    data class Success(val data: String) : State1407_6()
    data class Error(val message: String) : State1407_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
