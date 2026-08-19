package com.awesomeapp.f24impl

sealed class State746_5 {
    data object Loading : State746_5()
    data class Success(val data: String) : State746_5()
    data class Error(val message: String) : State746_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
