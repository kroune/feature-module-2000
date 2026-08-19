package com.awesomeapp.f171impl

sealed class State893_5 {
    data object Loading : State893_5()
    data class Success(val data: String) : State893_5()
    data class Error(val message: String) : State893_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
