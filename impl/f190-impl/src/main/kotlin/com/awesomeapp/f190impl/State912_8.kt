package com.awesomeapp.f190impl

sealed class State912_8 {
    data object Loading : State912_8()
    data class Success(val data: String) : State912_8()
    data class Error(val message: String) : State912_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
