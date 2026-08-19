package com.awesomeapp.f483impl

sealed class State1205_7 {
    data object Loading : State1205_7()
    data class Success(val data: String) : State1205_7()
    data class Error(val message: String) : State1205_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
