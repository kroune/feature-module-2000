package com.awesomeapp.f396impl

sealed class State1118_5 {
    data object Loading : State1118_5()
    data class Success(val data: String) : State1118_5()
    data class Error(val message: String) : State1118_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
