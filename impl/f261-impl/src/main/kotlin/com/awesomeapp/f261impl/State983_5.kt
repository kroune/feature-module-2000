package com.awesomeapp.f261impl

sealed class State983_5 {
    data object Loading : State983_5()
    data class Success(val data: String) : State983_5()
    data class Error(val message: String) : State983_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
