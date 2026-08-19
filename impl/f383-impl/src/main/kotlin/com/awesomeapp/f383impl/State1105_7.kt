package com.awesomeapp.f383impl

sealed class State1105_7 {
    data object Loading : State1105_7()
    data class Success(val data: String) : State1105_7()
    data class Error(val message: String) : State1105_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
