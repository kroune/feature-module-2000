package com.awesomeapp.f371impl

sealed class State1093_8 {
    data object Loading : State1093_8()
    data class Success(val data: String) : State1093_8()
    data class Error(val message: String) : State1093_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
