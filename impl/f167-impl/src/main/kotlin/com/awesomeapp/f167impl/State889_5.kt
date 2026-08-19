package com.awesomeapp.f167impl

sealed class State889_5 {
    data object Loading : State889_5()
    data class Success(val data: String) : State889_5()
    data class Error(val message: String) : State889_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
