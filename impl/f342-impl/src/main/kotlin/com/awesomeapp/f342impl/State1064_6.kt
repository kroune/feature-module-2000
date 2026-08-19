package com.awesomeapp.f342impl

sealed class State1064_6 {
    data object Loading : State1064_6()
    data class Success(val data: String) : State1064_6()
    data class Error(val message: String) : State1064_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
