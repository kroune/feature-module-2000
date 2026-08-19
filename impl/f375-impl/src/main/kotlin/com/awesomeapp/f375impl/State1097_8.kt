package com.awesomeapp.f375impl

sealed class State1097_8 {
    data object Loading : State1097_8()
    data class Success(val data: String) : State1097_8()
    data class Error(val message: String) : State1097_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
