package com.awesomeapp.f9impl

sealed class State731_8 {
    data object Loading : State731_8()
    data class Success(val data: String) : State731_8()
    data class Error(val message: String) : State731_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
