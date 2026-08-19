package com.awesomeapp.f268impl

sealed class State990_8 {
    data object Loading : State990_8()
    data class Success(val data: String) : State990_8()
    data class Error(val message: String) : State990_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
