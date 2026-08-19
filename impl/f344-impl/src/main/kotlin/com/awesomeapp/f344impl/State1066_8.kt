package com.awesomeapp.f344impl

sealed class State1066_8 {
    data object Loading : State1066_8()
    data class Success(val data: String) : State1066_8()
    data class Error(val message: String) : State1066_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
