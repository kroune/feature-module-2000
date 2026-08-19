package com.awesomeapp.f438impl

sealed class State1160_8 {
    data object Loading : State1160_8()
    data class Success(val data: String) : State1160_8()
    data class Error(val message: String) : State1160_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
