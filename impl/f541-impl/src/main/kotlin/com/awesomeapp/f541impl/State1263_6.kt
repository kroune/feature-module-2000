package com.awesomeapp.f541impl

sealed class State1263_6 {
    data object Loading : State1263_6()
    data class Success(val data: String) : State1263_6()
    data class Error(val message: String) : State1263_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
