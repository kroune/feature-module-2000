package com.awesomeapp.f308impl

sealed class State1030_7 {
    data object Loading : State1030_7()
    data class Success(val data: String) : State1030_7()
    data class Error(val message: String) : State1030_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
