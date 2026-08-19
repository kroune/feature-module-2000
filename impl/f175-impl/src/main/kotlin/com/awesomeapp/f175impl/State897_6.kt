package com.awesomeapp.f175impl

sealed class State897_6 {
    data object Loading : State897_6()
    data class Success(val data: String) : State897_6()
    data class Error(val message: String) : State897_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
