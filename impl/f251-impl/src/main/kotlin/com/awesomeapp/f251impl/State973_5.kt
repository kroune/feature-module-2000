package com.awesomeapp.f251impl

sealed class State973_5 {
    data object Loading : State973_5()
    data class Success(val data: String) : State973_5()
    data class Error(val message: String) : State973_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
