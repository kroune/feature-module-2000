package com.awesomeapp.f527impl

sealed class State1249_5 {
    data object Loading : State1249_5()
    data class Success(val data: String) : State1249_5()
    data class Error(val message: String) : State1249_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
