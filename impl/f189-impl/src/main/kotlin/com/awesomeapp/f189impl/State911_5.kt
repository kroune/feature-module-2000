package com.awesomeapp.f189impl

sealed class State911_5 {
    data object Loading : State911_5()
    data class Success(val data: String) : State911_5()
    data class Error(val message: String) : State911_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
