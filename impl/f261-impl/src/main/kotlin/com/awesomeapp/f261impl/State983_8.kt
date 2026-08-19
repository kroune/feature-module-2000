package com.awesomeapp.f261impl

sealed class State983_8 {
    data object Loading : State983_8()
    data class Success(val data: String) : State983_8()
    data class Error(val message: String) : State983_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
