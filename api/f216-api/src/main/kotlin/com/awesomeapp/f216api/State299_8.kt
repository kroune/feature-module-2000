package com.awesomeapp.f216api

sealed class State299_8 {
    data object Loading : State299_8()
    data class Success(val data: String) : State299_8()
    data class Error(val message: String) : State299_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
