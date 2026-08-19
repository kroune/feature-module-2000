package com.awesomeapp.f187impl

sealed class State909_6 {
    data object Loading : State909_6()
    data class Success(val data: String) : State909_6()
    data class Error(val message: String) : State909_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
