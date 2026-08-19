package com.awesomeapp.f145api

sealed class State228_8 {
    data object Loading : State228_8()
    data class Success(val data: String) : State228_8()
    data class Error(val message: String) : State228_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
