package com.awesomeapp.f157impl

sealed class State879_6 {
    data object Loading : State879_6()
    data class Success(val data: String) : State879_6()
    data class Error(val message: String) : State879_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
