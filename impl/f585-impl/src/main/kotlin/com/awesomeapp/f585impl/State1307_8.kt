package com.awesomeapp.f585impl

sealed class State1307_8 {
    data object Loading : State1307_8()
    data class Success(val data: String) : State1307_8()
    data class Error(val message: String) : State1307_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
