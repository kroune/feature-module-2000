package com.awesomeapp.f529api

sealed class State612_8 {
    data object Loading : State612_8()
    data class Success(val data: String) : State612_8()
    data class Error(val message: String) : State612_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
