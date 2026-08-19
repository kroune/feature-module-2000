package com.awesomeapp.f335api

sealed class State418_8 {
    data object Loading : State418_8()
    data class Success(val data: String) : State418_8()
    data class Error(val message: String) : State418_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
