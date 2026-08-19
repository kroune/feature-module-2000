package com.awesomeapp.f129impl

sealed class State851_5 {
    data object Loading : State851_5()
    data class Success(val data: String) : State851_5()
    data class Error(val message: String) : State851_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
