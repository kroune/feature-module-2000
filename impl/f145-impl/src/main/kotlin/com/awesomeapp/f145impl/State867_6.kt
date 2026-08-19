package com.awesomeapp.f145impl

sealed class State867_6 {
    data object Loading : State867_6()
    data class Success(val data: String) : State867_6()
    data class Error(val message: String) : State867_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
