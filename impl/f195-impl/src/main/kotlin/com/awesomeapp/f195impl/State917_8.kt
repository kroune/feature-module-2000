package com.awesomeapp.f195impl

sealed class State917_8 {
    data object Loading : State917_8()
    data class Success(val data: String) : State917_8()
    data class Error(val message: String) : State917_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
