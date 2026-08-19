package com.awesomeapp.f242ui

sealed class State1603_5 {
    data object Loading : State1603_5()
    data class Success(val data: String) : State1603_5()
    data class Error(val message: String) : State1603_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
