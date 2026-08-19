package com.awesomeapp.f1impl

sealed class State723_6 {
    data object Loading : State723_6()
    data class Success(val data: String) : State723_6()
    data class Error(val message: String) : State723_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
