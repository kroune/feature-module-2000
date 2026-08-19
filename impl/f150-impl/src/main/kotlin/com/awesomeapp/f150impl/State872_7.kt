package com.awesomeapp.f150impl

sealed class State872_7 {
    data object Loading : State872_7()
    data class Success(val data: String) : State872_7()
    data class Error(val message: String) : State872_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
