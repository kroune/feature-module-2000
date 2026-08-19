package com.awesomeapp.f135impl

sealed class State857_8 {
    data object Loading : State857_8()
    data class Success(val data: String) : State857_8()
    data class Error(val message: String) : State857_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
