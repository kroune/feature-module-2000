package com.awesomeapp.f221ui

sealed class State1582_8 {
    data object Loading : State1582_8()
    data class Success(val data: String) : State1582_8()
    data class Error(val message: String) : State1582_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
