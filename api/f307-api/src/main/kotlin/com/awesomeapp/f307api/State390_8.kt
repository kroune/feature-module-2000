package com.awesomeapp.f307api

sealed class State390_8 {
    data object Loading : State390_8()
    data class Success(val data: String) : State390_8()
    data class Error(val message: String) : State390_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
