package com.awesomeapp.f550impl

sealed class State1272_7 {
    data object Loading : State1272_7()
    data class Success(val data: String) : State1272_7()
    data class Error(val message: String) : State1272_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
