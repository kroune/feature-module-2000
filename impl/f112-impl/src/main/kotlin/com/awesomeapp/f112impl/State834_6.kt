package com.awesomeapp.f112impl

sealed class State834_6 {
    data object Loading : State834_6()
    data class Success(val data: String) : State834_6()
    data class Error(val message: String) : State834_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
