package com.awesomeapp.f174impl

sealed class State896_7 {
    data object Loading : State896_7()
    data class Success(val data: String) : State896_7()
    data class Error(val message: String) : State896_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
