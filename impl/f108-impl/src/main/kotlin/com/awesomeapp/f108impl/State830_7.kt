package com.awesomeapp.f108impl

sealed class State830_7 {
    data object Loading : State830_7()
    data class Success(val data: String) : State830_7()
    data class Error(val message: String) : State830_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
