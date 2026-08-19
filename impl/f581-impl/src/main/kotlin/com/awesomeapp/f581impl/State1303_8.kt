package com.awesomeapp.f581impl

sealed class State1303_8 {
    data object Loading : State1303_8()
    data class Success(val data: String) : State1303_8()
    data class Error(val message: String) : State1303_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
