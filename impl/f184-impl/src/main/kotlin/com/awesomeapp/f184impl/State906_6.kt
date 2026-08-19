package com.awesomeapp.f184impl

sealed class State906_6 {
    data object Loading : State906_6()
    data class Success(val data: String) : State906_6()
    data class Error(val message: String) : State906_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
