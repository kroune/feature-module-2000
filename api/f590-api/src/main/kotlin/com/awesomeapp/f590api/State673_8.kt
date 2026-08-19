package com.awesomeapp.f590api

sealed class State673_8 {
    data object Loading : State673_8()
    data class Success(val data: String) : State673_8()
    data class Error(val message: String) : State673_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
