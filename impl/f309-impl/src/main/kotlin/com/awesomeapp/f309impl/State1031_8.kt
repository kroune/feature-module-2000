package com.awesomeapp.f309impl

sealed class State1031_8 {
    data object Loading : State1031_8()
    data class Success(val data: String) : State1031_8()
    data class Error(val message: String) : State1031_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
