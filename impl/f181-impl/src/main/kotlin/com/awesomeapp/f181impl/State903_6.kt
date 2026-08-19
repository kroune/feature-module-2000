package com.awesomeapp.f181impl

sealed class State903_6 {
    data object Loading : State903_6()
    data class Success(val data: String) : State903_6()
    data class Error(val message: String) : State903_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
