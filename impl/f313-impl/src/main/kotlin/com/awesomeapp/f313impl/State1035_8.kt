package com.awesomeapp.f313impl

sealed class State1035_8 {
    data object Loading : State1035_8()
    data class Success(val data: String) : State1035_8()
    data class Error(val message: String) : State1035_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
