package com.awesomeapp.f92impl

sealed class State814_8 {
    data object Loading : State814_8()
    data class Success(val data: String) : State814_8()
    data class Error(val message: String) : State814_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
