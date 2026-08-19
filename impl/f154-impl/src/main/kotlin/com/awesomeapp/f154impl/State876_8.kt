package com.awesomeapp.f154impl

sealed class State876_8 {
    data object Loading : State876_8()
    data class Success(val data: String) : State876_8()
    data class Error(val message: String) : State876_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
