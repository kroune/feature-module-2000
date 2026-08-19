package com.awesomeapp.f231api

sealed class State314_8 {
    data object Loading : State314_8()
    data class Success(val data: String) : State314_8()
    data class Error(val message: String) : State314_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
