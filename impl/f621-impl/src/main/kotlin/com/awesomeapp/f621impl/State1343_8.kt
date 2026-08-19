package com.awesomeapp.f621impl

sealed class State1343_8 {
    data object Loading : State1343_8()
    data class Success(val data: String) : State1343_8()
    data class Error(val message: String) : State1343_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
