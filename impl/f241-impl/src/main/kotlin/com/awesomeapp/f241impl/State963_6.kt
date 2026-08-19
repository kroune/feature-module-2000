package com.awesomeapp.f241impl

sealed class State963_6 {
    data object Loading : State963_6()
    data class Success(val data: String) : State963_6()
    data class Error(val message: String) : State963_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
