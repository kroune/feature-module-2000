package com.awesomeapp.f14impl

sealed class State736_7 {
    data object Loading : State736_7()
    data class Success(val data: String) : State736_7()
    data class Error(val message: String) : State736_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
