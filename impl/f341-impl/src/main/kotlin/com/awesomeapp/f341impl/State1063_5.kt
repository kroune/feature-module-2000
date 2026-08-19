package com.awesomeapp.f341impl

sealed class State1063_5 {
    data object Loading : State1063_5()
    data class Success(val data: String) : State1063_5()
    data class Error(val message: String) : State1063_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
