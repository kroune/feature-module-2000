package com.awesomeapp.foundation0

sealed class State1_8 {
    data object Loading : State1_8()
    data class Success(val data: String) : State1_8()
    data class Error(val message: String) : State1_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
