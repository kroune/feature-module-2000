package com.awesomeapp.f582impl

sealed class State1304_6 {
    data object Loading : State1304_6()
    data class Success(val data: String) : State1304_6()
    data class Error(val message: String) : State1304_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
