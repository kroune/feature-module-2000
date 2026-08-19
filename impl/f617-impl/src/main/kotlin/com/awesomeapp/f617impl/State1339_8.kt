package com.awesomeapp.f617impl

sealed class State1339_8 {
    data object Loading : State1339_8()
    data class Success(val data: String) : State1339_8()
    data class Error(val message: String) : State1339_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
