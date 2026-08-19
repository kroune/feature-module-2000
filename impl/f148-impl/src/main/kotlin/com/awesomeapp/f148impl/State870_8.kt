package com.awesomeapp.f148impl

sealed class State870_8 {
    data object Loading : State870_8()
    data class Success(val data: String) : State870_8()
    data class Error(val message: String) : State870_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
