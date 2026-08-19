package com.awesomeapp.f464impl

sealed class State1186_8 {
    data object Loading : State1186_8()
    data class Success(val data: String) : State1186_8()
    data class Error(val message: String) : State1186_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
