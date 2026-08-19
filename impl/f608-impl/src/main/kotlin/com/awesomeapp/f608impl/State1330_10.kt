package com.awesomeapp.f608impl

sealed class State1330_10 {
    data object Loading : State1330_10()
    data class Success(val data: String) : State1330_10()
    data class Error(val message: String) : State1330_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
