package com.awesomeapp.f580impl

sealed class State1302_6 {
    data object Loading : State1302_6()
    data class Success(val data: String) : State1302_6()
    data class Error(val message: String) : State1302_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
