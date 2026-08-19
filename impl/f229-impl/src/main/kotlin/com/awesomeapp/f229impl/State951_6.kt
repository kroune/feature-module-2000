package com.awesomeapp.f229impl

sealed class State951_6 {
    data object Loading : State951_6()
    data class Success(val data: String) : State951_6()
    data class Error(val message: String) : State951_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
