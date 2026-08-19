package com.awesomeapp.f12impl

sealed class State734_5 {
    data object Loading : State734_5()
    data class Success(val data: String) : State734_5()
    data class Error(val message: String) : State734_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
