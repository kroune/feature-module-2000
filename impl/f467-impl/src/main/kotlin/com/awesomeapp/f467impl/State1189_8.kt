package com.awesomeapp.f467impl

sealed class State1189_8 {
    data object Loading : State1189_8()
    data class Success(val data: String) : State1189_8()
    data class Error(val message: String) : State1189_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
