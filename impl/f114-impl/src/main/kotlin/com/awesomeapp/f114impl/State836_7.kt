package com.awesomeapp.f114impl

sealed class State836_7 {
    data object Loading : State836_7()
    data class Success(val data: String) : State836_7()
    data class Error(val message: String) : State836_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
