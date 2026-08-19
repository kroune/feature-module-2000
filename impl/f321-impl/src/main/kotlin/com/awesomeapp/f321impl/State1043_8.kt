package com.awesomeapp.f321impl

sealed class State1043_8 {
    data object Loading : State1043_8()
    data class Success(val data: String) : State1043_8()
    data class Error(val message: String) : State1043_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
