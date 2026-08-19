package com.awesomeapp.f624impl

sealed class State1346_5 {
    data object Loading : State1346_5()
    data class Success(val data: String) : State1346_5()
    data class Error(val message: String) : State1346_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
