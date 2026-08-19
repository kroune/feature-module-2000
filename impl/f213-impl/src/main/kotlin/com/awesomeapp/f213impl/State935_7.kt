package com.awesomeapp.f213impl

sealed class State935_7 {
    data object Loading : State935_7()
    data class Success(val data: String) : State935_7()
    data class Error(val message: String) : State935_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
