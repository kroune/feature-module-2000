package com.awesomeapp.f584impl

sealed class State1306_5 {
    data object Loading : State1306_5()
    data class Success(val data: String) : State1306_5()
    data class Error(val message: String) : State1306_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
