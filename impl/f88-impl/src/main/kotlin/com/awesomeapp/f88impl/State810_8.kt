package com.awesomeapp.f88impl

sealed class State810_8 {
    data object Loading : State810_8()
    data class Success(val data: String) : State810_8()
    data class Error(val message: String) : State810_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
