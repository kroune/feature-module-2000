package com.awesomeapp.f85impl

sealed class State807_6 {
    data object Loading : State807_6()
    data class Success(val data: String) : State807_6()
    data class Error(val message: String) : State807_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
