package com.awesomeapp.f335impl

sealed class State1057_8 {
    data object Loading : State1057_8()
    data class Success(val data: String) : State1057_8()
    data class Error(val message: String) : State1057_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
