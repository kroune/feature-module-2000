package com.awesomeapp.f167impl

sealed class State889_8 {
    data object Loading : State889_8()
    data class Success(val data: String) : State889_8()
    data class Error(val message: String) : State889_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
