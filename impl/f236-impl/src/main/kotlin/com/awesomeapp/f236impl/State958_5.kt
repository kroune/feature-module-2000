package com.awesomeapp.f236impl

sealed class State958_5 {
    data object Loading : State958_5()
    data class Success(val data: String) : State958_5()
    data class Error(val message: String) : State958_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
