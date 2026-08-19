package com.awesomeapp.f462impl

sealed class State1184_6 {
    data object Loading : State1184_6()
    data class Success(val data: String) : State1184_6()
    data class Error(val message: String) : State1184_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
