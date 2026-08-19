package com.awesomeapp.f262api

sealed class State345_8 {
    data object Loading : State345_8()
    data class Success(val data: String) : State345_8()
    data class Error(val message: String) : State345_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
