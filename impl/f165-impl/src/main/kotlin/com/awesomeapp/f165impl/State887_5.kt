package com.awesomeapp.f165impl

sealed class State887_5 {
    data object Loading : State887_5()
    data class Success(val data: String) : State887_5()
    data class Error(val message: String) : State887_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
