package com.awesomeapp.f34impl

sealed class State756_8 {
    data object Loading : State756_8()
    data class Success(val data: String) : State756_8()
    data class Error(val message: String) : State756_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
