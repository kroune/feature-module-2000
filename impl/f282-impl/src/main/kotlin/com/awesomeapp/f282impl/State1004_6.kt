package com.awesomeapp.f282impl

sealed class State1004_6 {
    data object Loading : State1004_6()
    data class Success(val data: String) : State1004_6()
    data class Error(val message: String) : State1004_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
