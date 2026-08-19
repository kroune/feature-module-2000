package com.awesomeapp.f55impl

sealed class State777_6 {
    data object Loading : State777_6()
    data class Success(val data: String) : State777_6()
    data class Error(val message: String) : State777_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
