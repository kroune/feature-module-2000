package com.awesomeapp.f197ui

sealed class State1558_8 {
    data object Loading : State1558_8()
    data class Success(val data: String) : State1558_8()
    data class Error(val message: String) : State1558_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
