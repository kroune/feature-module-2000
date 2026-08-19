package com.awesomeapp.f448impl

sealed class State1170_8 {
    data object Loading : State1170_8()
    data class Success(val data: String) : State1170_8()
    data class Error(val message: String) : State1170_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
