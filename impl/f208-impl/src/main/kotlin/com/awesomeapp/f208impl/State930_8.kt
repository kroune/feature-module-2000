package com.awesomeapp.f208impl

sealed class State930_8 {
    data object Loading : State930_8()
    data class Success(val data: String) : State930_8()
    data class Error(val message: String) : State930_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
