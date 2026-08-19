package com.awesomeapp.f16impl

sealed class State738_6 {
    data object Loading : State738_6()
    data class Success(val data: String) : State738_6()
    data class Error(val message: String) : State738_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
