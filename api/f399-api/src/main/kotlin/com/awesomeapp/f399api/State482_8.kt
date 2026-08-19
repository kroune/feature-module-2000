package com.awesomeapp.f399api

sealed class State482_8 {
    data object Loading : State482_8()
    data class Success(val data: String) : State482_8()
    data class Error(val message: String) : State482_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
