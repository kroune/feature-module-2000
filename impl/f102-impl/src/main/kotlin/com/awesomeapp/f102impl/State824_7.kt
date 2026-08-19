package com.awesomeapp.f102impl

sealed class State824_7 {
    data object Loading : State824_7()
    data class Success(val data: String) : State824_7()
    data class Error(val message: String) : State824_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
