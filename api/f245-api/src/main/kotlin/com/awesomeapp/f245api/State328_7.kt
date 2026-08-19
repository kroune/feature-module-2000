package com.awesomeapp.f245api

sealed class State328_7 {
    data object Loading : State328_7()
    data class Success(val data: String) : State328_7()
    data class Error(val message: String) : State328_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
