package com.awesomeapp.f579impl

sealed class State1301_5 {
    data object Loading : State1301_5()
    data class Success(val data: String) : State1301_5()
    data class Error(val message: String) : State1301_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
