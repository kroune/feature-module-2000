package com.awesomeapp.f599ui

sealed class State1960_8 {
    data object Loading : State1960_8()
    data class Success(val data: String) : State1960_8()
    data class Error(val message: String) : State1960_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
