package com.awesomeapp.f259impl

sealed class State981_6 {
    data object Loading : State981_6()
    data class Success(val data: String) : State981_6()
    data class Error(val message: String) : State981_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
