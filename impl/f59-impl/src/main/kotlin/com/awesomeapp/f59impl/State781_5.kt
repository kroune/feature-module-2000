package com.awesomeapp.f59impl

sealed class State781_5 {
    data object Loading : State781_5()
    data class Success(val data: String) : State781_5()
    data class Error(val message: String) : State781_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
