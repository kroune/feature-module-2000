package com.awesomeapp.f406impl

sealed class State1128_7 {
    data object Loading : State1128_7()
    data class Success(val data: String) : State1128_7()
    data class Error(val message: String) : State1128_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
