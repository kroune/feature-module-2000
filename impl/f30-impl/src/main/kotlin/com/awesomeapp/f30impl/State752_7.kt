package com.awesomeapp.f30impl

sealed class State752_7 {
    data object Loading : State752_7()
    data class Success(val data: String) : State752_7()
    data class Error(val message: String) : State752_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
