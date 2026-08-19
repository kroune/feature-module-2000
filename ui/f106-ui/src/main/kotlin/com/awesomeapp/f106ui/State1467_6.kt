package com.awesomeapp.f106ui

sealed class State1467_6 {
    data object Loading : State1467_6()
    data class Success(val data: String) : State1467_6()
    data class Error(val message: String) : State1467_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
