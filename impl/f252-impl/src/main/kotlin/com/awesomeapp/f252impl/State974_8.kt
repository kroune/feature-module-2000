package com.awesomeapp.f252impl

sealed class State974_8 {
    data object Loading : State974_8()
    data class Success(val data: String) : State974_8()
    data class Error(val message: String) : State974_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
