package com.awesomeapp.f35impl

sealed class State757_5 {
    data object Loading : State757_5()
    data class Success(val data: String) : State757_5()
    data class Error(val message: String) : State757_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
