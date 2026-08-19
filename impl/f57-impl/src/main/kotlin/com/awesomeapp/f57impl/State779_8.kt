package com.awesomeapp.f57impl

sealed class State779_8 {
    data object Loading : State779_8()
    data class Success(val data: String) : State779_8()
    data class Error(val message: String) : State779_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
