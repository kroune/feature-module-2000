package com.awesomeapp.f193api

sealed class State276_8 {
    data object Loading : State276_8()
    data class Success(val data: String) : State276_8()
    data class Error(val message: String) : State276_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
