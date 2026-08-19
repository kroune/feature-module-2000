package com.awesomeapp.f64impl

sealed class State786_6 {
    data object Loading : State786_6()
    data class Success(val data: String) : State786_6()
    data class Error(val message: String) : State786_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
