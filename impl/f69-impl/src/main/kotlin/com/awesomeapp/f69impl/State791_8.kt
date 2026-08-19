package com.awesomeapp.f69impl

sealed class State791_8 {
    data object Loading : State791_8()
    data class Success(val data: String) : State791_8()
    data class Error(val message: String) : State791_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
