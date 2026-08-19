package com.awesomeapp.f161impl

sealed class State883_8 {
    data object Loading : State883_8()
    data class Success(val data: String) : State883_8()
    data class Error(val message: String) : State883_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
