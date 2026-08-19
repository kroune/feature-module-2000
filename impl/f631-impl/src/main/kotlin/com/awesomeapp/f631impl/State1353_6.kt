package com.awesomeapp.f631impl

sealed class State1353_6 {
    data object Loading : State1353_6()
    data class Success(val data: String) : State1353_6()
    data class Error(val message: String) : State1353_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
