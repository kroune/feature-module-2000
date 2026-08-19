package com.awesomeapp.f51impl

sealed class State773_8 {
    data object Loading : State773_8()
    data class Success(val data: String) : State773_8()
    data class Error(val message: String) : State773_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
