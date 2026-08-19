package com.awesomeapp.f399impl

sealed class State1121_8 {
    data object Loading : State1121_8()
    data class Success(val data: String) : State1121_8()
    data class Error(val message: String) : State1121_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
