package com.awesomeapp.f349api

sealed class State432_8 {
    data object Loading : State432_8()
    data class Success(val data: String) : State432_8()
    data class Error(val message: String) : State432_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
