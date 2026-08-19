package com.awesomeapp.f35impl

sealed class State757_8 {
    data object Loading : State757_8()
    data class Success(val data: String) : State757_8()
    data class Error(val message: String) : State757_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
