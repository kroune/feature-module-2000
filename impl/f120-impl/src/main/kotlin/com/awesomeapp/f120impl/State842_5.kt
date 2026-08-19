package com.awesomeapp.f120impl

sealed class State842_5 {
    data object Loading : State842_5()
    data class Success(val data: String) : State842_5()
    data class Error(val message: String) : State842_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
