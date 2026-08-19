package com.awesomeapp.f521impl

sealed class State1243_8 {
    data object Loading : State1243_8()
    data class Success(val data: String) : State1243_8()
    data class Error(val message: String) : State1243_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
