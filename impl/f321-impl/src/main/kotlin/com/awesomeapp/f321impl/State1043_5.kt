package com.awesomeapp.f321impl

sealed class State1043_5 {
    data object Loading : State1043_5()
    data class Success(val data: String) : State1043_5()
    data class Error(val message: String) : State1043_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
