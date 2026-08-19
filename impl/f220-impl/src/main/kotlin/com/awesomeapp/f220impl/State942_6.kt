package com.awesomeapp.f220impl

sealed class State942_6 {
    data object Loading : State942_6()
    data class Success(val data: String) : State942_6()
    data class Error(val message: String) : State942_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
