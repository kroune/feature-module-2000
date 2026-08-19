package com.awesomeapp.f446impl

sealed class State1168_6 {
    data object Loading : State1168_6()
    data class Success(val data: String) : State1168_6()
    data class Error(val message: String) : State1168_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
