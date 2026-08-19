package com.awesomeapp.f10impl

sealed class State732_8 {
    data object Loading : State732_8()
    data class Success(val data: String) : State732_8()
    data class Error(val message: String) : State732_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
