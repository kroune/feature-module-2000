package com.awesomeapp.f172impl

sealed class State894_6 {
    data object Loading : State894_6()
    data class Success(val data: String) : State894_6()
    data class Error(val message: String) : State894_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
