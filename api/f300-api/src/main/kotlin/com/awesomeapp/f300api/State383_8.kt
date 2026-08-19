package com.awesomeapp.f300api

sealed class State383_8 {
    data object Loading : State383_8()
    data class Success(val data: String) : State383_8()
    data class Error(val message: String) : State383_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
