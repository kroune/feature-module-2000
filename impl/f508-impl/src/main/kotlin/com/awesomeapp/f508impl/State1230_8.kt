package com.awesomeapp.f508impl

sealed class State1230_8 {
    data object Loading : State1230_8()
    data class Success(val data: String) : State1230_8()
    data class Error(val message: String) : State1230_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
