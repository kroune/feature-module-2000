package com.awesomeapp.f480impl

sealed class State1202_5 {
    data object Loading : State1202_5()
    data class Success(val data: String) : State1202_5()
    data class Error(val message: String) : State1202_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
