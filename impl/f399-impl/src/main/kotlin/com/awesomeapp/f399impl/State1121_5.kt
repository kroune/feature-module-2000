package com.awesomeapp.f399impl

sealed class State1121_5 {
    data object Loading : State1121_5()
    data class Success(val data: String) : State1121_5()
    data class Error(val message: String) : State1121_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
