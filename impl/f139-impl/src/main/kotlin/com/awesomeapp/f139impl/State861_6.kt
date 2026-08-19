package com.awesomeapp.f139impl

sealed class State861_6 {
    data object Loading : State861_6()
    data class Success(val data: String) : State861_6()
    data class Error(val message: String) : State861_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
