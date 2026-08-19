package com.awesomeapp.f257impl

sealed class State979_8 {
    data object Loading : State979_8()
    data class Success(val data: String) : State979_8()
    data class Error(val message: String) : State979_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
