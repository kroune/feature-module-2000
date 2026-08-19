package com.awesomeapp.f40impl

sealed class State762_6 {
    data object Loading : State762_6()
    data class Success(val data: String) : State762_6()
    data class Error(val message: String) : State762_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
