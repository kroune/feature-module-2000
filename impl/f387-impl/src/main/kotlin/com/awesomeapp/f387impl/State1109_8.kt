package com.awesomeapp.f387impl

sealed class State1109_8 {
    data object Loading : State1109_8()
    data class Success(val data: String) : State1109_8()
    data class Error(val message: String) : State1109_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
