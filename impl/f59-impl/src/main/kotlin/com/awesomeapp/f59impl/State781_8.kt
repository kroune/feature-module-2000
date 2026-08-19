package com.awesomeapp.f59impl

sealed class State781_8 {
    data object Loading : State781_8()
    data class Success(val data: String) : State781_8()
    data class Error(val message: String) : State781_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
