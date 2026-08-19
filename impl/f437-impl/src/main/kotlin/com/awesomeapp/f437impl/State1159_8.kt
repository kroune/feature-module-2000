package com.awesomeapp.f437impl

sealed class State1159_8 {
    data object Loading : State1159_8()
    data class Success(val data: String) : State1159_8()
    data class Error(val message: String) : State1159_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
