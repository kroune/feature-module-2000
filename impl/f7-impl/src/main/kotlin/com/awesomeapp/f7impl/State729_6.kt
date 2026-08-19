package com.awesomeapp.f7impl

sealed class State729_6 {
    data object Loading : State729_6()
    data class Success(val data: String) : State729_6()
    data class Error(val message: String) : State729_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
