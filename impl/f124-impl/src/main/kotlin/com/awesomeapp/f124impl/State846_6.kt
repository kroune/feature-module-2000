package com.awesomeapp.f124impl

sealed class State846_6 {
    data object Loading : State846_6()
    data class Success(val data: String) : State846_6()
    data class Error(val message: String) : State846_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
