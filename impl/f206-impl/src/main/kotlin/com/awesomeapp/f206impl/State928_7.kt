package com.awesomeapp.f206impl

sealed class State928_7 {
    data object Loading : State928_7()
    data class Success(val data: String) : State928_7()
    data class Error(val message: String) : State928_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
