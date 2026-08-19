package com.awesomeapp.f218api

sealed class State301_8 {
    data object Loading : State301_8()
    data class Success(val data: String) : State301_8()
    data class Error(val message: String) : State301_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
